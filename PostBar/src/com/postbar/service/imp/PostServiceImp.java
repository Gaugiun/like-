package com.postbar.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.postbar.dao.PostDao;
import com.postbar.dao.ReplyDao;
import com.postbar.dao.entities.Post;
import com.postbar.dao.entities.Reply;
import com.postbar.service.PostService;

@Service
public class PostServiceImp implements PostService {

	@Autowired
	private PostDao postDao;
	@Autowired
	private ReplyDao replyDao;
	
	@Transactional(readOnly=true)
	@Override
	public List<Post> getPostByBarId(Integer barId) {
		return this.postDao.getPostByBarId(barId);
	}

	@Transactional()
	@Override
	public boolean doInsertPost(Post post, String url) {
		boolean flag=false;
		this.postDao.doInsPost(post);
		Integer postId=this.postDao.getPostId();
		Reply reply=new Reply(0,postId,post.getAccountId(),0,post.getPostContent(),url,null,0,0);
		this.replyDao.doInsertReply(reply);
		flag=true;
		return flag;
	}

}
