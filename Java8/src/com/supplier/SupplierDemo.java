package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Date> s= ()-> new Date();
		System.out.println(s.get());

		Supplier<String> sp=()-> {
				String[] s1= {"bunny", "penny", "sunny"};
				int a= (int) (Math.random() * 3);
				return s1[a];
		};
		
		System.out.println(sp.get());
		
		
	}

}
