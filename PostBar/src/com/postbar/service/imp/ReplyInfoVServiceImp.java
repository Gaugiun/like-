package com.postbar.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.postbar.dao.ReplyInfoVDao;
import com.postbar.dao.entities.ReplyInfoV;
import com.postbar.service.ReplyInfoVService;

@Service
public class ReplyInfoVServiceImp implements ReplyInfoVService {
	@Autowired
	private ReplyInfoVDao replyInfoVDao;
	
	@Transactional(readOnly=true)
	@Override
	public List<ReplyInfoV> getReplyInfoVByPostIdAndRepliseId(Integer postId, Integer repliseId) {
		return this.replyInfoVDao.getReplyInfoVByPostIdAndRepliseId(postId, repliseId);
	}

	@Override
	public List<ReplyInfoV> getReplyInfoVByName(Integer postId, String name) {
		return this.replyInfoVDao.getReplyInfoVByName(postId, name);
	}

}
