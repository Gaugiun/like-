package com.postbar.dao;

import java.util.List;

import com.postbar.dao.entities.ReplyInfoV;

public interface ReplyInfoVDao {
	//ͨ��postId��repliesId��ȡ���е���ϸ����
	public List<ReplyInfoV> getReplyInfoVByPostIdAndRepliseId(Integer postId,Integer repliseId);
	
	//ͨ��ģ��ģ����ѯ�ظ�
		public List<ReplyInfoV> getReplyInfoVByName(Integer postId,String name);
}
