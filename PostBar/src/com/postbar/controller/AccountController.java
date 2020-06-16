package com.postbar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.postbar.dao.entities.Account;
import com.postbar.service.AccountService;

@SessionAttributes(types= {Account.class})
@Controller
@RequestMapping(value="/account")
public class AccountController {

	@Autowired
	private AccountService postBarService;
	
	//��¼
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public  boolean  Login(@RequestParam("Name") String name ,@RequestParam("Password")String password ,Map<String ,Object> map ) {
		boolean falg=false;
		try {
			Account account=this.postBarService.getAccountByNameAndPassword(name, password);
			map.put("account", account);
			falg=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return falg;
	}
	//��֤�û����Ƿ����
	@ResponseBody
	@RequestMapping(value="/checkName")
	public boolean CheckAccountName(String Name) {
		return this.postBarService.checkAccountName(Name);
	}
	
	//��֤�ֻ����Ƿ����
	@ResponseBody
	@RequestMapping(value="/checkPhone")
	public boolean CheckAccountPhone(String Phone) {
		return this.postBarService.checkAccountPhone(Phone);
	}
	
	//ע��
	@ResponseBody
	@RequestMapping(value="/register")
	public boolean Register(Account account) {
		boolean falg=this.postBarService.doInsertAccount(account);
		return falg;
	}
	
	
}
