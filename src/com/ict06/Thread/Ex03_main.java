package com.ict06.Thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("수고하셨습니다.");
		System.out.println("==============");
		
		// 스레드 처리하기 위해서 start() 실행 하면
		// run()로 가야 하지만 스레드처리가 된다.
		// 그런데 start() 가 있어서 start()로 간다.
		// 이것은 스레드 처리가 아니다.
		// Ex03에 있는 start메소드를 주석처리하면 
		// start() => run() 로 가게 된다.
		// 이것을 스레드 처리했다고 한다.
		System.out.println(Thread.currentThread().getName());
		t1.start();
		System.out.println("수고하셨습니다.");
		System.out.println("==============");

		
	}
}
