package com.postbar.dao;

import com.postbar.dao.entities.ReplyEvaluate;

public interface ReplyEvaluateDao {
	public ReplyEvaluate getReplyEvaluateByReplyIdAndAccountId(Integer replyId,Integer accountId);
	public void doInsertReplyEvaluate(ReplyEvaluate replyEvaluate);
	public void doUpdateReplyEvaluate(ReplyEvaluate replyEvaluate);
	public Integer getSumByReplyIdAndState(Integer replyId, Integer state);
}
