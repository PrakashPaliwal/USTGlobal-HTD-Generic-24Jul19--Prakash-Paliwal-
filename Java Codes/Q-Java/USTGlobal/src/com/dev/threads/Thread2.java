package com.dev.threads;

public class Thread2 extends Thread {
	
@Override
public void run() {
	System.out.println("T2 Thread Started...");
	
	System.out.println("Thread 2 prints the value of j");
	
	for(int j=1;j<=10;j++) {
		System.out.println("J = "+j);
	}
	
	System.out.println("T2 thread Terminated...");
}
	

}
