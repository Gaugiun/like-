package com.postbar.service;

import com.postbar.dao.entities.Reply;

public interface ReplyService {
		//�������
		public boolean doInsertReply(Reply reply);
		//ͨ��Id��ȡ������Ϣ
		public Reply getReplyByReplyId(Integer replyId);
		
		//ͨ��postId��ȡ��������
		public Reply getReplyByPostId(Integer postId);
		//���µ�����
		public boolean doUpdateLikeSumAndUnlikeSum(Reply reply);
}
