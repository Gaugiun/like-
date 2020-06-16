package com.postbar.dao;

import java.util.List;

import com.postbar.dao.entities.PostInfoV;

public interface PostInfoVDao {
	//通过barId查询出所有的帖子的详细内容
	public List<PostInfoV> getPostInfoVByBarId(Integer barId);
	
	//通过模糊模糊查询帖子
	public List<PostInfoV> getPostInfoVByName(Integer barId,String name);
}	
