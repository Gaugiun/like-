package com.postbar.dao.entities;

public class ReplyEvaluate {
	private Integer evaluateId;
	private Integer replyId;
	private Integer accountId;
	private Integer evaluateState;
	public Integer getEvaluateId() {
		return evaluateId;
	}
	public void setEvaluateId(Integer evaluateId) {
		this.evaluateId = evaluateId;
	}
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getEvaluateState() {
		return evaluateState;
	}
	public void setEvaluateState(Integer evaluateState) {
		this.evaluateState = evaluateState;
	}
	public ReplyEvaluate(Integer evaluateId, Integer replyId, Integer accountId, Integer evaluateState) {
		super();
		this.evaluateId = evaluateId;
		this.replyId = replyId;
		this.accountId = accountId;
		this.evaluateState = evaluateState;
	}
	public ReplyEvaluate() {
		super();
	}
	
}
