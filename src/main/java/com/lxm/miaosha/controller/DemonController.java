package com.lxm.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxm.miaosha.domain.User;
import com.lxm.miaosha.redis.KeyPrefix;
import com.lxm.miaosha.redis.RedisService;
import com.lxm.miaosha.redis.UserKey;
import com.lxm.miaosha.service.UserService;
import com.lxm.miaosha.result.CodeMsg;
import com.lxm.miaosha.result.Result;


	@Controller
	@RequestMapping("/demo")
	public class DemonController {//信息由对象封装并返回  json输出页面
		
		@Autowired
		UserService userService;
		
		@Autowired
		RedisService redisSrvice;
		
	     @RequestMapping( "/" )
	     @ResponseBody
	     public String home(){
	        return "Hello SpringBoot" ;
	    }
	     @RequestMapping( "/hello" )
	     @ResponseBody
	     public Result<String> hello(){
	    	 return Result.success("hello,nihao");
	     }
	     @RequestMapping( "/helloError" )
	     @ResponseBody
	     public Result<String> helloErrot(){
	    	 return Result.error(CodeMsg.SERVER_ERROR);
	     }
	     @RequestMapping( "/thymeleaf" )//通过配置文件找到hello.html
	     public String thymeleaf(Model mode){
	    	 mode.addAttribute("name", "lixiaomin");
	    	 return "hello";
	     }
	     @RequestMapping( "/db/get" )
	     @ResponseBody 
	     public Result<User> dbGet(){
	    	 User user =userService.getById(1);
	    	 return Result.success(user);
	     }
	     @RequestMapping( "/db/tx" )
	     @ResponseBody 
	     public Result<Boolean> dbTx(){
	    	 
	    	 userService.tx();
	    	 return Result.success(true);
	     }
	     @RequestMapping( "/redis/get" )
	     @ResponseBody 
	     public Result<User> redisGet(){
	    	 User v1 = redisSrvice.get(UserKey.getById, ""+1, User.class);
	    	 return Result.success(v1);
	     }
	     @RequestMapping( "/redis/set" )
	     @ResponseBody 
	     public Result<Boolean> redisSet(){
	    	User user = new User();
	    	user.setId(1);
	    	user.setName("12312");
	    	redisSrvice.set(UserKey.getById, ""+1, user);
	    	 return Result.success(true);
	     }
	     //1.rest api json输出 2.页面
	     
	     
//	     public static void main(String[] args) {
//	       SpringApplication. run(DemonController.class, args );s
//	    }
	}

