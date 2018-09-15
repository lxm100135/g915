package com.lxm.miaosha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxm.miaosha.dao.UserDao;
import com.lxm.miaosha.domain.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User getById(int id) {
		return userDao.getById(id);
		
	}
	@Transactional
	public boolean tx() {
		User u1 = new User();
//		u1.setId(2);
		u1.setName("李晓敏");
		userDao.insert(u1);
		User u2 = new User();
		u2.setId(1);
		u2.setName("王强");
		userDao.insert(u2);
		return true;
	}
}
