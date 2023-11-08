package com.core;

class A implements Runnable{     // can also create thread using implements Runnable instead of extends Thread if we want to extend another class
		   						// class A implements Runnable		Runnable is functional Interface with run method
	public void run() {
		show();
	} 

	public void show() {
		for(int i=0;i<50;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}
class B implements Runnable{
	
	public void run() {
		show();
	}
	
	public void show() {
		for(int i=0;i<50;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadPractise {
	public static void main(String[] args) {
		A obj = new A();	// also can create Runnable type for object
		B obj1 = new B();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		t1.start();
		t2.start();
		
	}
}
