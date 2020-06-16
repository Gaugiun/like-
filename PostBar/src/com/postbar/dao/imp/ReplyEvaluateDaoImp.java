package com.postbar.dao.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.postbar.dao.ReplyEvaluateDao;
import com.postbar.dao.entities.ReplyEvaluate;
@Repository
public class ReplyEvaluateDaoImp implements ReplyEvaluateDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public ReplyEvaluate getReplyEvaluateByReplyIdAndAccountId(Integer replyId,Integer accountId) {
		String sql="select * from reply_evaluate where reply_id=? and account_id =?";
		RowMapper<ReplyEvaluate> rowMapper =new BeanPropertyRowMapper<>(ReplyEvaluate.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper ,replyId,accountId);
	}

	@Override
	public void doInsertReplyEvaluate(ReplyEvaluate replyEvaluate) {
		String sql="insert into reply_evaluate(reply_id,account_id,evaluate_state) values(?,?,?)";
		this.jdbcTemplate.update(sql,replyEvaluate.getReplyId(),replyEvaluate.getAccountId(),replyEvaluate.getEvaluateState());
	}

	@Override
	public Integer getSumByReplyIdAndState(Integer replyId, Integer state) {
		String sql="select count(*) from reply_evaluate where reply_id =? and evaluate_state=?";
		return this.jdbcTemplate.queryForObject(sql, Integer.class,replyId,state);
	}

	@Override
	public void doUpdateReplyEvaluate(ReplyEvaluate replyEvaluate) {
		String sql="update reply_evaluate set evaluate_state=? where evaluate_id=?";
		this.jdbcTemplate.update(sql,replyEvaluate.getEvaluateState(),replyEvaluate.getEvaluateId());
	}

}
