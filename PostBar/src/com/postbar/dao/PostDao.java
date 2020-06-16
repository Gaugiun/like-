package com.postbar.dao;

import java.util.List;

import com.postbar.dao.entities.Post;

public interface PostDao {
	//ͨ������ID��ȡ���е�����
	public List<Post> getPostByBarId(Integer barId);
	
	//�������
	public void doInsPost(Post post);
	
	//��ȡ������id
	public Integer getPostId();
}
