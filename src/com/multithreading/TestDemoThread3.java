package com.multithreading;
class VideoThread extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			System.out.println(" video thread");
		}
	}
}
class AudioThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			System.out.println(" audio thread");
		}
	}
}
class TimerThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<=10;i++) {
			System.out.println(" timer thread");
		}
	}
}

public class TestDemoThread3 extends Thread implements Runnable {
	
	public static void main(String[] args) {
		VideoThread v1=new VideoThread();
		v1.start();
		AudioThread a1=new AudioThread();
		a1.start();
		TimerThread t1=new TimerThread();
		t1.start();
	}

}
