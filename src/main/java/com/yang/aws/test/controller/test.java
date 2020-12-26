package com.yang.aws.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

	@GetMapping(path="/test")
	public String test() {
		return "test ok";
	}
}
