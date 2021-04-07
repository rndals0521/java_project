package com.ict06.Thread;

import java.util.Iterator;

// ������� start() -> run() �̵��ؾ� ������ ó���� ��
//          start() -> start() ������ƴ�
//          run() -> run() ������ƴ�

// ������ ������ Thread Ŭ������ ���, Runnable �������̽� ���
// ������ Ŭ������ start(), run() ��� ������ �ִ�.
// Runnable �������̽��� run()�� ������ �ִ�.

public class Ex03 extends Thread{
	public void go() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	/*
	@Override
	public void start() {
		for (int i = 1; i < 15; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	*/
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
