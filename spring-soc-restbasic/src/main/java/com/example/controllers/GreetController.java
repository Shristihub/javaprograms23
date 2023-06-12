package com.example.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

//	http://localhost:8080/greet
	@GetMapping("greet")
	public String greet() {
		return "Have a great day";
	}
//	http://localhost:8080/show
	@GetMapping("/show")
	public List<String> showCourses() {
		return Arrays.asList("Java","Angular");
	}
//	http://localhost:8080/say-hello/Sri
	@GetMapping("say-hello/{uname}")
	public String sayHello(@PathVariable("uname")  String username) {
		return "Have a great day "+username;
	}
//	http://localhost:8080/select/Angular
	@GetMapping("/select/{course}")
	public String selectOne(@PathVariable("course") String courseName) {
		return Arrays.asList("Java","Angular")
					.stream()
					.filter(str->str.equals(courseName))
					.findFirst()
					.orElse("no course available");
	}
	
//	http://localhost:8080/print-details?username=Sri&city=Bangalore
	@GetMapping("print-details")
	public String printDetails(@RequestParam("username") String username,
			             @RequestParam("city") String city) {
		return "Welcome ".concat(username).concat("from ").concat(city);
	}
}












