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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.postbar.dao.entities.Reply;
import com.postbar.dao.entities.ReplyInfoV;
import com.postbar.service.ReplyInfoVService;
import com.postbar.service.ReplyService;
import com.postbar.util.GetFileName;

@Controller
@RequestMapping(value="/reply")
public class ReplyController {

		@Autowired
		private ReplyInfoVService replyInfoVService;
		
		@Autowired
		private ReplyService replyService;
		
		@ResponseBody
		@RequestMapping("/getAllReply")
		public List<ReplyInfoV> getReplyInfoVByPost(Integer postId){
			List<ReplyInfoV> list=this.replyInfoVService.getReplyInfoVByPostIdAndRepliseId(postId, 0);
			List<ReplyInfoV> list1=this.replyInfoVService.getReplyInfoVByPostIdAndRepliseId(postId, list.get(0).getReplyId());
			list.addAll(list1);
			return list;
		}
		
		@ResponseBody
		@Transactional
		@RequestMapping(value="/doInsReply")
		public boolean doInsPost(Reply reply,MultipartFile file,HttpSession session ,HttpServletRequest request) throws IllegalStateException, IOException {
			String fileName="";
			if(file!=null) {
				String []s=file.getOriginalFilename().split("\\.");
				String ext=s[1];
				fileName=GetFileName.getFilName(request)+"."+ext;
				File newFile=new File(session.getServletContext().getRealPath("/file")+File.separator+fileName);
				file.transferTo(newFile);
			}
			List<ReplyInfoV> list=this.replyInfoVService.getReplyInfoVByPostIdAndRepliseId(reply.getPostId(), 0);
			reply.setAttachmentUrl(fileName);
			reply.setRepliesId(list.get(0).getReplyId());
			return this.replyService.doInsertReply(reply);
		}
		@ResponseBody
		@Transactional(readOnly=true)
		@RequestMapping(value="/getReplyByContent")
		public List<ReplyInfoV> getReplyByContent(String name ,Integer postId){
			return this.replyInfoVService.getReplyInfoVByName(postId, name);
		}
		
}
