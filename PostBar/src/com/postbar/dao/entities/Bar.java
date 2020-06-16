package com.postbar.dao.entities;

public class Bar {

	private Integer barId;
	private String barName;
	private String barDescribe;
	private String registrationDate;
	private Integer accountId;
	private Integer barCode;
	public Integer getBarId() {
		return barId;
	}
	public void setBarId(Integer barId) {
		this.barId = barId;
	}
	public String getBarName() {
		return barName;
	}
	public void setBarName(String barName) {
		this.barName = barName;
	}
	public String getBarDescribe() {
		return barDescribe;
	}
	public void setBarDescribe(String barDescribe) {
		this.barDescribe = barDescribe;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getBarCode() {
		return barCode;
	}
	public void setBarCode(Integer barCode) {
		this.barCode = barCode;
	}
	public Bar(Integer barId, String barName, String barDescribe, String registrationDate, Integer accountId,
			Integer barCode) {
		super();
		this.barId = barId;
		this.barName = barName;
		this.barDescribe = barDescribe;
		this.registrationDate = registrationDate;
		this.accountId = accountId;
		this.barCode = barCode;
	}
	public Bar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
