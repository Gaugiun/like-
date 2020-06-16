package com.postbar.service;

import com.postbar.dao.entities.Account;

public interface AccountService {
	public Account getAccountByNameAndPassword(String name,String password);
	
	public boolean doInsertAccount(Account account);
	
	public boolean checkAccountName(String name);
	
	public boolean checkAccountPhone(String phone);
	
}
