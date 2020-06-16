package com.postbar.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postbar.dao.PostInfoVDao;
import com.postbar.dao.entities.PostInfoV;
import com.postbar.service.PostInfoVService;

@Service
public class PostInfoVServiceImp implements PostInfoVService {

	@Autowired
	private PostInfoVDao postInfoVDao;
	
	@Override
	public List<PostInfoV> getPostInfoVByBarId(Integer barId) {
		return this.postInfoVDao.getPostInfoVByBarId(barId);
	}

	@Override
	public List<PostInfoV> getPostInfoVByName(Integer barId, String name) {
		return this.postInfoVDao.getPostInfoVByName(barId, name);
	}
	

}
