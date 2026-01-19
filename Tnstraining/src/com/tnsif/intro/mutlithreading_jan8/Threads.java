package com.tnsif.intro.mutlithreading_jan8;

public class Threads {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++) {
			multithread mt=new multithread();
			mt.start();
			Thread.sleep(5000);
		}
	}

}
