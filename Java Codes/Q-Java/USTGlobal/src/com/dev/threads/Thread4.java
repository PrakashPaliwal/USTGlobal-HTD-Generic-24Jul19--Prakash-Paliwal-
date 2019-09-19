package com.dev.threads;

public class Thread4 extends Thread {

	Printer p;
	WatchingTV w;
	public Thread4(Printer pref) {
		p = pref;
	}
	
	
	public Thread4(WatchingTV wref) {
		w = wref;
	}
	
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//p.printVal(10, "Thread4");
		try {
			w.watch(10, "Thread4");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
