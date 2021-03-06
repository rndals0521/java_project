package com.ict03.class03;

public class Ex04_main {
	public static void main(String[] args) {
		Ex03 t1 = new Ex03();
		System.out.println(t1); // 주소찍을때 주소가 3개 다 똑같이 나옴
		
		// 부모와 자식이 같이 가지고 있으면 자식 멤버를 사용
		System.out.println(t1.name);
		// 자식에게 없는 멤버는 부모에게 있는 멤버를 사용
		System.out.println(t1.addr);
		
		// 메소드도 마찬가지이다.
		t1.sound();
		t1.prn();
		System.out.println("================");
		
		// static은 객체생성이랑 상관없다.
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		
		// 자식과 부모가 같은 메소드를 가지고 있으면
		// 자식 메소드를 실행한다.
		t1.eat();
		
	}
}
