package com.postbar.dao.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.postbar.dao.PostDao;
import com.postbar.dao.entities.Post;

@Repository
public class PostDaoImp implements PostDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Post> getPostByBarId(Integer barId) {
		String sql="select post_id,account_id,bar_id,post_subject,post_content,post_state,post_date,check_date,admin_id from post where bar_id=?";
		RowMapper<Post> rowMapper=new BeanPropertyRowMapper<>(Post.class);
		return this.jdbcTemplate.query(sql, rowMapper, barId);
	}

	@Override
	public void doInsPost(Post post) {
		String sql="insert into post(account_id,bar_id,post_subject,post_content,post_date) values(?,?,?,?,?)";
		this.jdbcTemplate.update(sql,post.getAccountId(),post.getBarId(),post.getPostSubject(),post.getPostContent(),new java.sql.Date(new Date().getTime()));
	}

	@Override
	public Integer getPostId() {
		String sql="SELECT LAST_INSERT_ID()";
		return this.jdbcTemplate.queryForObject(sql, Integer.class);
	}

}
