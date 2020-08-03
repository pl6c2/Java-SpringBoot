package com.lifecyclemethods;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child");
		}
	}
}
public class YieldDemo {

	public static void main(String[] args) {
		
       MyThread1 m=new MyThread1();
       m.start();
       
       for(int i=0;i<5;i++)
       {
    	   Thread.yield();
    	   System.out.println("main");
       }
	}

}

