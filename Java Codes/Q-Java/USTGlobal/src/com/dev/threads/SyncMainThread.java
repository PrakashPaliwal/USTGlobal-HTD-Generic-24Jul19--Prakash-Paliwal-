package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("SyncMain Thread started...");
		Printer p = new Printer();
		
		//new Thread4(p).start();
		//Thread4 t4 = new Thread4(p);
		//t4.start();
		//t4.join();
		
		//new Thread5(p).start();
		
		WatchingTV w = new WatchingTV();
		
		Thread tw4 = new Thread4(w);
				tw4.start();
				tw4.join();
		new Thread5(w).start();

		
		
		System.out.println("SyncMain Thread terminated...");
		
	}

}
