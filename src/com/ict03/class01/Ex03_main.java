package com.ict03.class01;

public class Ex03_main {

	public static void main(String[] args) {
		//Ex03 클래스를 객체로 만들자
		Ex03 ex03 = new Ex03();
		
		// plus01은 void이므로 받을 게 없다.
		System.out.println(1);
		ex03.plus01();
		System.out.println(2);
		System.out.println(ex03.result);
		
		// sub01은 반환형이 int이므로 저장 변수도 int로 만들자
		int sub = ex03.sub01();
		System.out.println(sub);

	}

}
