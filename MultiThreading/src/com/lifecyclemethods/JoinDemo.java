package com.lifecyclemethods;

class MyThread extends Thread
{
	static Thread tt=new Thread();
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				tt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child");
		}
	}
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread.tt=Thread.currentThread();
		MyThread m=new MyThread();
		
		m.start();
		
//		m.join();
		for(int i=0;i<10;i++)
		{
			System.out.println("main");
		}
		

	}

}



