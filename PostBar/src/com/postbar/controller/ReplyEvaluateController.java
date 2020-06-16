package com.postbar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.postbar.dao.entities.Reply;
import com.postbar.dao.entities.ReplyEvaluate;
import com.postbar.service.ReplyEvaluateService;
import com.postbar.service.ReplyService;

@Controller
@RequestMapping("/replyEvaluate")
public class ReplyEvaluateController {
	
	@Autowired
	private ReplyEvaluateService replyEvaluateService;
	@Autowired
	private ReplyService replyService;
	
	//���޻���
	@ResponseBody
	@RequestMapping("/doupate")
	public Reply doUpdate(ReplyEvaluate replyEvalute) {
		
		Reply reply=this.replyService.getReplyByReplyId(replyEvalute.getReplyId());
		try {
			ReplyEvaluate Evaluate=this.replyEvaluateService.getReplyEvaluateByReplyIdAndAccountId(replyEvalute.getReplyId(), replyEvalute.getAccountId());
			if(Evaluate.getEvaluateState()==replyEvalute.getEvaluateState()) {
				//ȡ������
			/*	Evaluate.setEvaluateState(3);
				this.replyEvaluateService.doUpdateReplyEvaluate(Evaluate);*/
				return reply;
			}else {
			Evaluate.setEvaluateState(replyEvalute.getEvaluateState());
			this.replyEvaluateService.doUpdateReplyEvaluate(Evaluate);
			}
			//��ȡ������
			reply.setLikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 1));
			//��ȡ�����
			reply.setUnlikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 2));
			
			this.replyService.doUpdateLikeSumAndUnlikeSum(reply);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			this.replyEvaluateService.doInsertReplyEvaluate(replyEvalute);
			//��ȡ������
			reply.setLikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 1));
			//��ȡ�����
			reply.setUnlikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 2));
			
			this.replyService.doUpdateLikeSumAndUnlikeSum(reply);
			
		}
		return reply;
		
	}
	
	//����������
	@ResponseBody
	@RequestMapping("/doupatePostLike")
	public Reply doUpdatePostLike(Integer postId ,ReplyEvaluate replyEvalute) {
		Reply reply=this.replyService.getReplyByPostId(postId);
		System.out.println(reply);
		replyEvalute.setReplyId(reply.getReplyId());
		try {
			ReplyEvaluate Evaluate=this.replyEvaluateService.getReplyEvaluateByReplyIdAndAccountId(reply.getReplyId(),replyEvalute.getAccountId());
			if(Evaluate.getEvaluateState()==replyEvalute.getEvaluateState()) {
				//ȡ������
			/*	Evaluate.setEvaluateState(3);
				this.replyEvaluateService.doUpdateReplyEvaluate(Evaluate);*/
				return reply;
			}else {
			Evaluate.setEvaluateState(replyEvalute.getEvaluateState());
			this.replyEvaluateService.doUpdateReplyEvaluate(Evaluate);
			}
			//��ȡ������
			reply.setLikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 1));
			//��ȡ�����
			reply.setUnlikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 2));
			
			this.replyService.doUpdateLikeSumAndUnlikeSum(reply);
			
		} catch (Exception e) {
			e.printStackTrace();
			this.replyEvaluateService.doInsertReplyEvaluate(replyEvalute);
			//��ȡ������
			reply.setLikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 1));
			//��ȡ�����
			reply.setUnlikeSum(this.replyEvaluateService.getSumByReplyIdAndState(reply.getReplyId(), 2));
			
			this.replyService.doUpdateLikeSumAndUnlikeSum(reply);
		}
		return reply;
	}
	
}
