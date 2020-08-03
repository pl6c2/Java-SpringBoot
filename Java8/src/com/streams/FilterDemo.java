package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String args[]) {
		
		List<String> l=new ArrayList<>();
		l.add("prem");
		l.add("chand");
		l.add("crazy");
		List<String> r=l.stream().filter(s-> s.length()>4).collect(Collectors.toList());
		List<String> r1=l.stream().filter(s-> s.startsWith("p")).collect(Collectors.toList());
		long r4=l.stream().sorted().count();
		Stream<String> r5=l.stream().sorted().limit(1);
//		System.out.println(r5.collect(Collectors.toList()));
		List<String> r2=l.stream().sorted().collect(Collectors.toList());
		List<String> r3=l.stream().sorted((s1,s2)-> -s1.compareTo(s2)).collect(Collectors.toList());
//		System.out.println(r3);
		
		l.stream().sorted().forEach(s-> System.out.println(s));
		
		List<Integer> l1=new ArrayList<>();
		l1.add(23);
		l1.add(45);
		l1.add(65);
		long res=l1.stream().count();
//		long res1=l1.stream().max((i1,i2)-> (i1>i2)? 1: (i1<i2)? -1: 0);
//		System.out.println(res1);
		
		
	}

}
