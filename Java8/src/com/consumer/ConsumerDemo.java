package com.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c=s-> System.out.println(s);
		c.accept("premchand");
		
		
		Consumer<String> c1=s-> System.out.println(s);
		Consumer<String> c2=s-> System.out.println(s+ "hi");
		Consumer<String> c3=c1.andThen(c2);
		c3.accept("hi");
		

	}

}
