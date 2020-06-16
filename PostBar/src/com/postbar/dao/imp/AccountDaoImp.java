package com.postbar.dao.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.postbar.dao.AccountDao;
import com.postbar.dao.entities.Account;

@Repository
public class AccountDaoImp implements AccountDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public Account getAccountByNameAndPassword(String name, String password) {
		String sql="select account_id,account_name,account_phone from account where account_name=? and account_password=?";
		RowMapper<Account> rowMapper=new BeanPropertyRowMapper<>(Account.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper, name,password);
	}


	@Override
	public void doInsertAccount(Account account) {
		String sql="insert into account(account_name,account_password,account_phone)values(?,?,?)";
		this.jdbcTemplate.update(sql,account.getAccountName(),account.getAccountPassWord(),account.getAccountPhone());
	}


	@Override
	public Integer checkAccountName(String name) {
		String sql="select count(*) from account where account_name=?";
		return this.jdbcTemplate.queryForObject(sql,Integer.class,name);
	}


	@Override
	public Integer checkAccountPhone(String phone) {
		String sql="select count(*) from account where account_phone=?";
		return this.jdbcTemplate.queryForObject(sql,Integer.class,phone);
	}
	
}
