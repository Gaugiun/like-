package com.postbar.dao.entities;

public class ReplyInfoV {
	private Integer replyId;
	private Integer postId;
	private Integer accountId;
	private Integer repliesId;
	private String replyContent;
	private String attachmentUrl;
	private String replyDate;
	private Integer likeSum;
	private Integer unlikeSum;
	private String accountName;
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
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
	public Integer getRepliesId() {
		return repliesId;
	}
	public void setRepliesId(Integer repliesId) {
		this.repliesId = repliesId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getAttachmentUrl() {
		return attachmentUrl;
	}
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}
	public String getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}
	public Integer getLikeSum() {
		return likeSum;
	}
	public void setLikeSum(Integer likeSum) {
		this.likeSum = likeSum;
	}
	public Integer getUnlikeSum() {
		return unlikeSum;
	}
	public void setUnlikeSum(Integer unlikeSum) {
		this.unlikeSum = unlikeSum;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public ReplyInfoV(Integer replyId, Integer postId, Integer accountId, Integer repliesId, String replyContent,
			String attachmentUrl, String replyDate, Integer likeSum, Integer unlikeSum, String accountName) {
		super();
		this.replyId = replyId;
		this.postId = postId;
		this.accountId = accountId;
		this.repliesId = repliesId;
		this.replyContent = replyContent;
		this.attachmentUrl = attachmentUrl;
		this.replyDate = replyDate;
		this.likeSum = likeSum;
		this.unlikeSum = unlikeSum;
		this.accountName = accountName;
	}
	public ReplyInfoV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
