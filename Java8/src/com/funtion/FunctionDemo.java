package com.funtion;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> f= s -> s.length();
		System.out.println(f.apply("prem"));
		
		Function<String,String> f1= s -> s.replaceAll(" ", "");
		System.out.println(f1.apply("prem chand lingam gunta"));
		
		Function<Integer, Integer> f2= i -> i+i;
		Function<Integer, Integer> f3=i -> i*i;
		
		System.out.println(f2.andThen(f3).apply(2));
		System.out.println(f2.compose(f2).apply(2));
		

	}

}
