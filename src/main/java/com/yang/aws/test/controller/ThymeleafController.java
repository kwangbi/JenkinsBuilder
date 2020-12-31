package com.yang.aws.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThymeleafController {
	@RequestMapping("/themeleaf")
	public String themeleaf(HttpServletResponse res) throws IOException{
		return "themeleaf/index";
	}
}
