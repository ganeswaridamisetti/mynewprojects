package com.multithreading;

public class TestdemoThreads2 extends Thread implements Runnable {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		TstDemoThread1 td = new TstDemoThread1();
		Thread t = new Thread(td);
		t.start();
		System.out.println("main method called");
		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);

		}
		System.out.println("main method ended");
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println("run method called");
		for (int i = 0; i <= 10; i++) {

			System.out.println("run : " + i);

		}
		System.out.println("run method ended");

	}

}
