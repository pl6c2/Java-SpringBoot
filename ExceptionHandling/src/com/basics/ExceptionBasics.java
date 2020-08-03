package com.basics;

public class ExceptionBasics {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		
//		catch(ArithmeticException e) {
//			System.out.println(e);
//			System.out.println("At arithematic");
//		}
//		
//		catch(Exception e) {
//			System.out.println(e);
//			System.out.println("hi");
//		}
		
		finally
		{
			System.out.println("At finally dude");
		}
		
		
		

	}

}
