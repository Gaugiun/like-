package com.postbar.service;

import com.postbar.dao.entities.Reply;

public interface ReplyService {
		//添加评论
		public boolean doInsertReply(Reply reply);
		//通过Id获取评论信息
		public Reply getReplyByReplyId(Integer replyId);
		
		//通过postId获取主贴内容
		public Reply getReplyByPostId(Integer postId);
		//更新点赞数
		public boolean doUpdateLikeSumAndUnlikeSum(Reply reply);
}
