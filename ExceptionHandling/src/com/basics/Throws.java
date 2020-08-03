package com.basics;

public class Throws {
	
	public static void dude() throws ArithmeticException
	{
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		
		try {
			dude();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
