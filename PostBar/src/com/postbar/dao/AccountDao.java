package com.postbar.dao;

import com.postbar.dao.entities.Account;

public interface AccountDao {
	//��¼��֤
	public  Account getAccountByNameAndPassword(String name,String password);
	
	//����û�
	public void doInsertAccount(Account account);
	
	//��֤�û����Ƿ����
	public Integer checkAccountName(String name);
	
	//��֤�ֻ����Ƿ�����
	public Integer checkAccountPhone(String phone);
}
