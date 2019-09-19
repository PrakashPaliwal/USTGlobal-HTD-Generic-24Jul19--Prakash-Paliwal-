package com.dev.threads;

public class Thread5 extends Thread {
	
	Printer p;
	WatchingTV w;
	public Thread5(Printer pref) {
		p = pref;
	}
	
	public Thread5(WatchingTV wref) {
		w = wref;
	}
	
	@Override
	public void run() {
		//p.printVal(10, "Thread5");
		try {
			w.watch(10, "Thread5");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
