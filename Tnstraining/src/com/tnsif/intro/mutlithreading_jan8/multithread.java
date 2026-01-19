package com.tnsif.intro.mutlithreading_jan8;

public class multithread extends Thread {
	public void run() {
		try {
			System.out.println("This is current thread"+Thread.currentThread().getId());
		}catch(Exception e) {
			System.out.println("Exception cought");
		}
	}

}
