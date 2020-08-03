package com.basics;

public class Throw {
	
	 
	 
	 public static void fun2()
		{
			throw new ArithmeticException("hi");
		}

	public static void main(String[] args) {

		try
		{
			fun2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
     
		
	
	}
}
