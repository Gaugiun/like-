package com.postbar.dao.entities;

public class Account {
	private Integer accountId;
	private String accountName;
	private String accountPassWord;
	private String accountPhone;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountPassWord() {
		return accountPassWord;
	}
	public void setAccountPassWord(String accountPassWord) {
		this.accountPassWord = accountPassWord;
	}
	public String getAccountPhone() {
		return accountPhone;
	}
	public void setAccountPhone(String accountPhone) {
		this.accountPhone = accountPhone;
	}
	public Account(Integer accountId, String accountName, String accountPassWord, String accountPhone) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountPassWord = accountPassWord;
		this.accountPhone = accountPhone;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
