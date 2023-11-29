package com.csp.onboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csp.onboard.model.AdminUser;
import com.csp.onboard.services.LoginService;


@Controller
@RequestMapping("/userLogin/")
public class LoginController {
	
	private LoginService loginService;
	
	@Autowired
    public LoginController(LoginService theLoginService) {
		loginService = theLoginService;
    }
	
	@GetMapping("signup")
	public String showSignUpForm(AdminUser users) {
		return "login";
	}
	
	//Check for Credentials
	 @PostMapping("/login")
	 public String login(@ModelAttribute(name="loginForm") AdminUser login, Model m) {
	  String uname = login.getUserId();
	  String pass = login.getPassword();
	  if(uname.equals("Admin") && pass.equals("Admin@123")) {
	   return "welcome";
	  }
	  m.addAttribute("error", "Incorrect Username & Password");
	  return "login";
	  
	 }

}
