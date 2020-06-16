package com.postbar.dao.entities;

public class Post {
	private Integer postId;
	private Integer accountId;
	private Integer barId;
	private String postSubject;
	private String postContent;
	private Integer postState;
	private String postDate;
	private String checkDate;
	private Integer admin_id;
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getBarId() {
		return barId;
	}
	public void setBarId(Integer barId) {
		this.barId = barId;
	}
	public String getPostSubject() {
		return postSubject;
	}
	public void setPostSubject(String postSubject) {
		this.postSubject = postSubject;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public Integer getPostState() {
		return postState;
	}
	public void setPostState(Integer postState) {
		this.postState = postState;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public Post(Integer postId, Integer accountId, Integer barId, String postSubject, String postContent,
			Integer postState, String postDate, String checkDate, Integer admin_id) {
		super();
		this.postId = postId;
		this.accountId = accountId;
		this.barId = barId;
		this.postSubject = postSubject;
		this.postContent = postContent;
		this.postState = postState;
		this.postDate = postDate;
		this.checkDate = checkDate;
		this.admin_id = admin_id;
	}
	public Post() {
		super();
	}
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", accountId=" + accountId + ", barId=" + barId + ", postSubject="
				+ postSubject + ", postContent=" + postContent + ", postState=" + postState + ", postDate=" + postDate
				+ ", checkDate=" + checkDate + ", admin_id=" + admin_id + "]";
	}
	
}
