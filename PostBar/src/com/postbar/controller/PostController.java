package com.postbar.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.postbar.dao.entities.Post;
import com.postbar.dao.entities.PostInfoV;
import com.postbar.service.PostInfoVService;
import com.postbar.service.PostService;
import com.postbar.util.GetFileName;

@Controller
@RequestMapping(value="/post")
public class PostController {

	@Autowired
	private PostService postService;
	@Autowired
	private PostInfoVService postInfoVService;
	
	@Transactional(readOnly=true)
	@ResponseBody
	@RequestMapping(value="/getPostByBarId",method=RequestMethod.POST)
	public List<PostInfoV> getPostByBarId(Integer barId){
		return this.postInfoVService.getPostInfoVByBarId(barId);
	}
	@ResponseBody
	@Transactional(readOnly=true)
	@RequestMapping(value="/getPostByPostName")
	public List<PostInfoV> getPsotInfoVByPostName(String name ,Integer barId){
		return this.postInfoVService.getPostInfoVByName(barId, name);
	}
	
	@ResponseBody
	@Transactional
	@RequestMapping(value="/doInsPost")
	public boolean doInsPost(Post post,MultipartFile file,HttpSession session ,HttpServletRequest request) throws IllegalStateException, IOException {
		String fileName="";
		if(file!=null) {
			String []s=file.getOriginalFilename().split("\\.");
			String ext=s[1];
			fileName=GetFileName.getFilName(request)+"."+ext;
			File newFile=new File(session.getServletContext().getRealPath("/file")+File.separator+fileName);
			file.transferTo(newFile);
		}
		return this.postService.doInsertPost(post, fileName);
	}
}
