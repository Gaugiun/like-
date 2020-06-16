package com.postbar.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.postbar.dao.ReplyInfoVDao;
import com.postbar.dao.entities.ReplyInfoV;

@Repository
public class ReplyInfoVDaoImp implements ReplyInfoVDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<ReplyInfoV> getReplyInfoVByPostIdAndRepliseId(Integer postId, Integer repliseId) {
		String sql="select * from reply_info_v where post_id =? and replies_id=?";
		RowMapper<ReplyInfoV> rowMapper =new BeanPropertyRowMapper<>(ReplyInfoV.class);
		return this.jdbcTemplate.query(sql, rowMapper,postId,repliseId);
	}

	@Override
	public List<ReplyInfoV> getReplyInfoVByName(Integer postId, String name) {
		String sql="select * from reply_info_v where post_id =? and reply_content like ?";
		RowMapper<ReplyInfoV> rowMapper =new BeanPropertyRowMapper<>(ReplyInfoV.class);
		return this.jdbcTemplate.query(sql, rowMapper,postId,"%"+name+"%");
	}

}
