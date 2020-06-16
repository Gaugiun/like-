package com.postbar.dao;

import java.util.List;

import com.postbar.dao.entities.Post;

public interface PostDao {
	//通过贴吧ID获取所有的帖子
	public List<Post> getPostByBarId(Integer barId);
	
	//添加帖子
	public void doInsPost(Post post);
	
	//获取新增的id
	public Integer getPostId();
}
