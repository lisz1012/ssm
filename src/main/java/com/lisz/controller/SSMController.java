package com.lisz.controller;

import com.lisz.bean.Dog;
import com.lisz.bean.User;
import com.lisz.dao.DogDao;
import com.lisz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SSMController {
	@Autowired
	private DogDao dogDao;

	@Autowired
	private UserDao userDao;

	@ResponseBody
	@RequestMapping("/test")
	public Dog testSSM(){
		System.out.println("test");
		Dog dog = dogDao.findById(1);
		System.out.println(dog);
		return dog;
	}
}
