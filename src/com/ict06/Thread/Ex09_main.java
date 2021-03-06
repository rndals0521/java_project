package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07,08,09 는 Runnable를 상속받았기 때문에
		// start() 가 없다.
		//t1.start();
		
		
		// 실행 run() 메소드를 가진 클래스 즉 타겟을 지정해야 한다.
		//Thread thread = new Thread(); 
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// 안드로이드에서 많이 사용하는 방법 (익명 내부 클래스)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName()+": warnningwarnning");
				}
			}
		}).start();
		
		// 많이 쓰이는건 Runnable 자바상속이 다중상속이 아니라 Thread를 상속받으면
		// 다른거 상속받기가 곤란
	}
}
