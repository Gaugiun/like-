package com.postbar.service;

import java.util.List;

import com.postbar.dao.entities.PostInfoV;

public interface PostInfoVService {
	public List<PostInfoV> getPostInfoVByBarId(Integer barId);
	public List<PostInfoV> getPostInfoVByName(Integer barId,String name);
}
