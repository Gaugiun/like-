package com.postbar.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.postbar.dao.PostInfoVDao;
import com.postbar.dao.entities.PostInfoV;

@Repository
public class PostInfoVDaoImp implements PostInfoVDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<PostInfoV> getPostInfoVByBarId(Integer barId) {
		String sql="select * from post_info_v where bar_id =?";
		RowMapper<PostInfoV> rowMapper=new BeanPropertyRowMapper<>(PostInfoV.class);
		return this.jdbcTemplate.query(sql, rowMapper,barId);
	}

	@Override
	public List<PostInfoV> getPostInfoVByName(Integer barId, String name) {
		String sql="select * from post_info_v where bar_id =? and (post_subject LIKE ? )OR (post_content LIKE ? ) ";
		RowMapper<PostInfoV> rowMapper=new BeanPropertyRowMapper<>(PostInfoV.class);
		return this.jdbcTemplate.query(sql, rowMapper,barId,"%"+name+"%","%"+name+"%");
	}

}
