package com.dev.threads;

public class MainThreadClass {



	public static void main(String[] args) {
		System.out.println("Main Threads Started...");


		// new T2().start();
		Thread2 t2 = new Thread2();
		
		//t2.setName("Thread T2");
		System.out.println("Main Thread print tha value of i");
		t2.start();

		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3);
		t.start();
		
		Thread.currentThread().setName("Main Thread");			// currentThread() represtent the current Thread ie., In this case Main Thread 

		//		new Thread(new T3()).start();

		//t2.start();
		
		t2.setPriority(2);
		t.setPriority(1);
		for(int i = 1; i<=10; i++) {
			System.out.println("i = "+i);

		}
		System.out.println("Thread Name2 : "+t2.getName());
		System.out.println("Thread Name1 : "+Thread.currentThread().getName());
		System.out.println("Thread 2 Id : "+t2.getId());
		System.out.println("Thread 3 Id : "+t.getId());								// using t instead of t3 since the Thread object is 't'
		System.out.println("Main Thread Id : "+Thread.currentThread().getId());
		
		System.out.println("Thread Priority2 : "+t2.getPriority());					// default priority value is 5
		System.out.println("Thread Priority3 : "+t.getPriority());
		System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());
		
		System.out.println("Main Thread terminated...");
	}
}
