package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Implementation.JustImplementation;

@RestController
@RequestMapping("/hi")
public class RestControllerPerson {
	
	@Autowired
	JustImplementation just;

	@GetMapping("/get")
	public String demo()
	{
	   just.demointer();
	   return "hello welcome prem";
	}
}
