package com.postbar.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postbar.dao.ReplyDao;
import com.postbar.dao.entities.Reply;
import com.postbar.service.ReplyService;

@Service
public class ReplyServiceImp implements ReplyService {

	@Autowired
	private ReplyDao replyDao;
	
	
	@Override
	public boolean doInsertReply(Reply reply) {
		boolean flag=false;
		this.replyDao.doInsertReply(reply);
		flag=true;
		return flag;
	}


	@Override
	public boolean doUpdateLikeSumAndUnlikeSum(Reply reply) {
		boolean flag=false;
		this.replyDao.doUpdateLikeSumAndUnlikeSum(reply);
		flag=true;
		return flag;
	}


	@Override
	public Reply getReplyByReplyId(Integer replyId) {
		return this.replyDao.getReplyByReplyId(replyId);
	}


	@Override
	public Reply getReplyByPostId(Integer postId) {
		return this.replyDao.getReplyByPostId(postId);
	}

}
