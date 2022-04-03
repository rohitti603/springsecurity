package com.telusko.secure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String show() {
		System.out.println("my controller called");
		return "index.html";
	}
}
