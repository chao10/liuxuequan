package com.foo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.foo.entity.User;
import com.foo.service.UserService;

@Controller
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userSerivce;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username,
	        @RequestParam("password") String password) {

		// Login user
		User user1 = new User();
		user1.setUsername(username);
		// DB stored user info
		User user2 = userSerivce.getUser(user1);
		if ((user2 != null) && user2.getPassword().equals(password)) {
			return "index";
		}
		return "login";
	}

	@RequestMapping("/user/{id}")
	public @ResponseBody User getUser(@PathVariable int id) {
		logger.debug("Find if the user exists in database...");
		User user = new User();
		user.setId(id);
		return userSerivce.getUser(user);
	}
}