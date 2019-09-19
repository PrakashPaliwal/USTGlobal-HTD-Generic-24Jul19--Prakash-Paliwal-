package com.dev.threads;

public class WatchingTV {
	
	static WatchingTV w = new WatchingTV();
	
	public void watch(int i, String thread) throws InterruptedException {
		for(int j=0; j<=i;j++) {
			System.out.println("Thread "+thread+" time left is "+j);
					
		}
	}

}
