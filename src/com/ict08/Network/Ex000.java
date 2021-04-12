package com.ict08.Network;

public class Ex000 {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		
		Thread thread_t1 = new Thread(t1,"dog");
		thread_t1.start();
		
		Thread thread_t2 = new Thread(t1,"cat");
		thread_t2.start();
		
		
	}
}
