package com.multithreading;

public class TstDemoThread1 extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		TstDemoThread1 td=new TstDemoThread1();
//		Thread t=new Thread(td);
		td.start();
	
		for(int i=0;i<=10;i++) {
			System.out.println("main called");
			System.out.println("main : "+i);
			System.out.println("main ended");
			
		}

	}
public void run() {
	System.out.println(Thread.currentThread());
	for(int i=0;i<=10;i++) {
		System.out.println("run called");
		System.out.println("run : "+i);
		System.out.println("run ended");

}
}
}