package com.postbar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.postbar.dao.entities.Bar;
import com.postbar.service.BarService;

@Controller
@RequestMapping(value="/bar")
@SessionAttributes(types= {Bar.class})
public class BarController {

	@Autowired
	private BarService barService;
	
	//获取所有的贴吧
	@ResponseBody
	@RequestMapping(value="/getAllBar",method=RequestMethod.POST)
	public List<Bar> getAllBar(){
		return this.barService.getAllBar();
	}
	//通过名字获取所有的贴吧
	@ResponseBody
	@RequestMapping(value="/getBarByName",method=RequestMethod.POST)
	public List<Bar> getBarByName(String name){
		return this.barService.getBarByName(name);
	}
	
	//通过获取贴吧信息
	@ResponseBody
	@RequestMapping(value="/skipPost",method=RequestMethod.POST)
	public Bar skipPost(Integer barId) {
		return this.barService.getBarByBarId(barId);
	}
	
	
	
	
}
