package com.postbar.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.postbar.dao.BarDao;
import com.postbar.dao.entities.Bar;

@Repository
public class BarDaoImp implements BarDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Bar> getAllBar() {
		String sql="select * from bar order by bar_code ";
		RowMapper<Bar> rowMapper=new BeanPropertyRowMapper<>(Bar.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Bar> getBarByName(String name) {
		String sql="select * from bar where bar_name like ? order by bar_code";
		RowMapper<Bar> rowMapper=new BeanPropertyRowMapper<>(Bar.class);
		return this.jdbcTemplate.query(sql, rowMapper,"%"+name+"%");
	}

	@Override
	public Bar getBarByBarId(Integer barId) {
		String sql="select * from bar where bar_id =?";
		RowMapper<Bar> rowMapper=new BeanPropertyRowMapper<>(Bar.class);
		return this.jdbcTemplate.queryForObject(sql,rowMapper,barId);
	}

}
