package com.postbar.dao;

import java.util.List;

import com.postbar.dao.entities.PostInfoV;

public interface PostInfoVDao {
	//ͨ��barId��ѯ�����е����ӵ���ϸ����
	public List<PostInfoV> getPostInfoVByBarId(Integer barId);
	
	//ͨ��ģ��ģ����ѯ����
	public List<PostInfoV> getPostInfoVByName(Integer barId,String name);
}	
