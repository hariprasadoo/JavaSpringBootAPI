package com.hari.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorldController {
	//Hello-world
	@GetMapping(path = "/hello-world")
	public String helloWrold() {
		return "Hello World API Get...";
	}
	
	@GetMapping(path = "/hello-world-hari")
	public HelloWroldHari helloWroldHari() {
		return new HelloWroldHari("Hello World Hari API Get...");
	}
	
	@GetMapping(path = "/hello-world-path/{name}")
	public HelloWroldHari helloWroldPath(@PathVariable String name) {
		return new HelloWroldHari("Hello " +name+" API Get...");
	}

}
