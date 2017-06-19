package config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {	
	
	@RequestMapping(value="/test",method = RequestMethod.GET)
	public String home2() {
		System.out.println("in home 2 method.");
		return "home1";
	}
	
	
	@RequestMapping(value="/")
	public String defaultM() {
		System.out.println("in defaultM method.");
		return "login";
	}
	
	/*@RequestMapping(value="/hello")
	public String hello() {
		System.out.println("in defaultM method.");
		return "login";
	}*/
	
	/*@RequestMapping(value="/login")
	public String login() {
		System.out.println("in login method.");
		return "home1";
	}*/
	
	@RequestMapping(value="/home1")
	public String home1() {
		System.out.println("in home1 method.");
		return "home1";
	}
	
	@RequestMapping(value="/error1")
	public String error() {
		System.out.println("in error method.");
		return "error1";
	}
	
	
	
	

}

