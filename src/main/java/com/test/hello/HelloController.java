package com.test.hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello World TODO";
	}
}
