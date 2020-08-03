package com.runnable;

public class RunnableDemo {
	
	public static void main(String args[])
	{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("In main");
		}
	}

}
