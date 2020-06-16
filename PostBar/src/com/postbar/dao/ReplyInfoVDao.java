package com.postbar.dao;

import java.util.List;

import com.postbar.dao.entities.ReplyInfoV;

public interface ReplyInfoVDao {
	//通过postId和repliesId获取所有的详细评价
	public List<ReplyInfoV> getReplyInfoVByPostIdAndRepliseId(Integer postId,Integer repliseId);
	
	//通过模糊模糊查询回复
		public List<ReplyInfoV> getReplyInfoVByName(Integer postId,String name);
}
