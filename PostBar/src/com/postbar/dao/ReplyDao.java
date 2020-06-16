package com.postbar.dao;

import com.postbar.dao.entities.Reply;

public interface ReplyDao {
	//�������
	public void doInsertReply(Reply reply);
	//ͨ��Id��ȡ������Ϣ
	public Reply getReplyByReplyId(Integer replyId);
	
	//ͨ��postId��ȡ��������Ϣ
	public Reply getReplyByPostId(Integer postId);
	
	//���µ��޺͵����
	public void doUpdateLikeSumAndUnlikeSum(Reply reply);
}
