package com.example.controller;
//1212313
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.UserModel;
import com.example.service.IUserService;

@Controller
@RequestMapping("user")
//@RestController=@Controller+@ResponseBody
public class UserController {
	// http://127.0.0.1:8080/demo/user/toLogin
//	http://127.0.0.1:8080/demo/loginServlet

	@Autowired
	private IUserService userService;

	@RequestMapping("toLogin")
//	@RequestMapping(value = "/toLogin", method = RequestMethod.GET)
//	@GetMapping("toLogin")
	public String toLogin() {
		return "helloJsp";
	}

	@RequestMapping("login")
	public String login(UserModel model) {
		return userService.login(model);
	}

	@RequestMapping("login2")
	@ResponseBody
	public String login2(UserModel model) {
//		return userService.login(model);
		return model.getCode();
				
	}

}
