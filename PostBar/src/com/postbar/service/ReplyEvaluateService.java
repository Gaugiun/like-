package com.postbar.service;

import com.postbar.dao.entities.ReplyEvaluate;

public interface ReplyEvaluateService {
	public ReplyEvaluate getReplyEvaluateByReplyIdAndAccountId(Integer replyId,Integer accountId);
	public void doInsertReplyEvaluate(ReplyEvaluate replyEvaluate);
	public Integer getSumByReplyIdAndState(Integer replyId, Integer state);
	public void doUpdateReplyEvaluate(ReplyEvaluate replyEvaluate);
}
