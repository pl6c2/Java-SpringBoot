package com.Implementation;

import org.springframework.stereotype.Service;

import com.JustInterface.JustInter;

@Service
public class JustImplementation implements JustInter {

	@Override
	public String demointer() {
		
		return "hi";
		
	}

}