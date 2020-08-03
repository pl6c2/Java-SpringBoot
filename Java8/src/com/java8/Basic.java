package com.java8;

@FunctionalInterface
interface demointer
{
	public void m1(String d);
}

public class Basic {

	public static void main(String[] args) {
	
		
		
		demointer f= s -> System.out.println(s.length()); 
		f.m1("premchand");

	}

}
