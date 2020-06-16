package com.postbar.service;

import java.util.List;

import com.postbar.dao.entities.Post;

public interface PostService {
	public List<Post> getPostByBarId(Integer barId);
	public boolean doInsertPost(Post post, String url);
}
