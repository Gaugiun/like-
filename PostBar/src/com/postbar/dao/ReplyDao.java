package com.postbar.dao;

import com.postbar.dao.entities.Reply;

public interface ReplyDao {
	//添加评论
	public void doInsertReply(Reply reply);
	//通过Id获取评论信息
	public Reply getReplyByReplyId(Integer replyId);
	
	//通过postId获取主贴的信息
	public Reply getReplyByPostId(Integer postId);
	
	//更新点赞和点踩数
	public void doUpdateLikeSumAndUnlikeSum(Reply reply);
}
