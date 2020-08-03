package com.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<String> o=Optional.of("prem");
		System.out.println(o.get()+ " "+ o.isPresent()+ " "+ o.empty()+ " "+ o.ofNullable("hi"));
		o.ifPresent(name -> System.out.println(name.length()));
		
		
		String name = null;
	    Optional<String> opt = Optional.ofNullable(name);
	    System.out.println(opt.isPresent());

	    
	    String nullName = "dhevudaaa";
	    String name1 = Optional.ofNullable(nullName).orElse("john");
	    String name2 = Optional.ofNullable(nullName).orElseGet(()->"john");
	   
	    System.out.println(name1+" "+ name2);
	}

}
