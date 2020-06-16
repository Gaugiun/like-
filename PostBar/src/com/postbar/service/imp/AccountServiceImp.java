package com.postbar.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.postbar.dao.AccountDao;
import com.postbar.dao.entities.Account;
import com.postbar.service.AccountService;

@Service
public class AccountServiceImp implements AccountService {
	
	@Autowired
	public AccountDao accountDao;

	@Transactional(readOnly=true)
	@Override
	public Account getAccountByNameAndPassword(String name, String password) {
		return this.accountDao.getAccountByNameAndPassword(name, password);
	}

	@Transactional()
	@Override
	public boolean doInsertAccount(Account account) {
		boolean falg=false;
		this.accountDao.doInsertAccount(account);
		falg=true;
		return falg;
	}

	@Transactional(readOnly=true)
	@Override
	public boolean checkAccountName(String name) {
		boolean falg=false;
		Integer count=this.accountDao.checkAccountName(name);
		if(count<1) {
			falg=true;
		}
		return falg;
	}

	@Override
	public boolean checkAccountPhone(String phone) {
		boolean falg=false;
		Integer count=this.accountDao.checkAccountPhone(phone);
		if(count<1) {
			falg=true;
		}
		return falg;
	}
	

}
