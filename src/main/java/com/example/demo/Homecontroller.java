package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	@RequestMapping("/home")
	public String home()
{
	return "hello welcome to the SBI bank";
}
	@RequestMapping("/contacts")
	public String contacts()
	{
		return "SBI contact:2345678901";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about:help or support";
	}
	@RequestMapping("/balance")
	public String balance()
	{
		return "your balance is:500";
	}
}
