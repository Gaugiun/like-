package com.postbar.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postbar.dao.ReplyEvaluateDao;
import com.postbar.dao.entities.ReplyEvaluate;
import com.postbar.service.ReplyEvaluateService;
@Service
public class ReplyEvaluateServiceImp implements ReplyEvaluateService {
	@Autowired
	private ReplyEvaluateDao replyEvaluateDao;
	
	@Override
	public ReplyEvaluate getReplyEvaluateByReplyIdAndAccountId(Integer replyId, Integer accountId) {
	return	this.replyEvaluateDao.getReplyEvaluateByReplyIdAndAccountId(replyId, accountId);
	}

	@Override
	public void doInsertReplyEvaluate(ReplyEvaluate replyEvaluate) {
		this.replyEvaluateDao.doInsertReplyEvaluate(replyEvaluate);
	}

	@Override
	public Integer getSumByReplyIdAndState(Integer replyId, Integer state) {
		return this.replyEvaluateDao.getSumByReplyIdAndState(replyId, state);
	}

	@Override
	public void doUpdateReplyEvaluate(ReplyEvaluate replyEvaluate) {
		this.replyEvaluateDao.doUpdateReplyEvaluate(replyEvaluate);
	}

}
