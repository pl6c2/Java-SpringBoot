package com.lifecyclemethods;

public class SleepDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
