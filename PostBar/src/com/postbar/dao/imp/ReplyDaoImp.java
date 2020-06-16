package com.postbar.dao.imp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.postbar.dao.ReplyDao;
import com.postbar.dao.entities.Reply;

@Repository
public class ReplyDaoImp implements ReplyDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void doInsertReply(Reply reply) {
		String sql="insert into reply(post_id,account_id,replies_id,reply_content,attachment_url,reply_date) values(?,?,?,?,?,?)" ; 
		this.jdbcTemplate.update(sql,reply.getPostId(),reply.getAccountId(),reply.getRepliesId(),reply.getReplyContent(),reply.getAttachmentUrl(),new java.sql.Date(new Date().getTime()));
	}

	@Override
	public void doUpdateLikeSumAndUnlikeSum(Reply reply) {
		String sql="update reply set like_sum =? ,unlike_sum =? where reply_id =?";
		this.jdbcTemplate.update(sql,reply.getLikeSum(),reply.getUnlikeSum(),reply.getReplyId());
	}

	@Override
	public Reply getReplyByReplyId(Integer replyId) {
		String sql="select * from reply where reply_id=?";
		RowMapper<Reply> rowMapper=new BeanPropertyRowMapper<>(Reply.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper,replyId);
	}

	@Override
	public Reply getReplyByPostId(Integer postId) {
		String sql="select * from reply where post_id=? and replies_id =0";
		RowMapper<Reply> rowMapper=new BeanPropertyRowMapper<>(Reply.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper,postId);
	}

}
