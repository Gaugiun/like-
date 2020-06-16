package com.postbar.dao;

import com.postbar.dao.entities.Account;

public interface AccountDao {
	//登录验证
	public  Account getAccountByNameAndPassword(String name,String password);
	
	//添加用户
	public void doInsertAccount(Account account);
	
	//验证用户名是否可用
	public Integer checkAccountName(String name);
	
	//验证手机号是否能用
	public Integer checkAccountPhone(String phone);
}
