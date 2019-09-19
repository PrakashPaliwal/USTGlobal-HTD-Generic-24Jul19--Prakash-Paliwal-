package com.dev.threads;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		System.out.println("T3 Thread Started...");
		

		System.out.println("Thread 3 prints the value of X");
		
		for(int j=1;j<=10;j++) {
			System.out.println("X = "+j);
		}
		
		System.out.println("T3 thread Terminated...");
	}
		
	}
	


