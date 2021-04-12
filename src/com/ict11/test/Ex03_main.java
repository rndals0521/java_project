package com.ict11.test;

import com.ict08.Network.ThreadTest;

public class Ex03_main {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		
		Thread thread_t1 = new Thread(t1,"dog");
		thread_t1.start();
		
		Thread thread_t2 = new Thread(t1,"cat");
		thread_t2.start();
		
		
	}
}
