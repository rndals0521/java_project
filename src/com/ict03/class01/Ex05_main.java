package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static은 객체 생성과 상관없이 사용가능
		// 클래스이름.멤버필드, 클래스이름.멤버메소드
		System.out.println(Ex05.s3);
		//System.out.println(Ex05.s4); //static이라도 private은 접근할 수 없다.
		
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.s1);
		//System.out.println(ex05.s2);  //private 접근안됨
		System.out.println(ex05.s3);
		
		//메소드들도 마찬가지
		ex05.add();
		//ex05.add2(); 접근이안됨 그래서 돌려서 쓴다.
		ex05.add3();
	}

}
