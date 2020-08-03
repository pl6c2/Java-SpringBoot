package com.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p=i-> i>10;
//		System.out.println(p.test(20));
		
		
		Predicate<Collection> p1=i-> i.contains("Prem");
		List<String> l=new ArrayList<>();
		l.add("Prem");
//		System.out.println(p1.test(l));
		
		
		
		Predicate<String> p2=i-> i.startsWith("P");
		List<String> l1=new ArrayList<>();
		l1.add("Prem");
		l1.add("Papam");
		l1.add("Prapancham");
		for(String s:l1)
		{
			System.out.println(p2.test(s));
		}
		
		
	}

}
