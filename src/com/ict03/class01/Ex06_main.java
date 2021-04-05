package com.ict03.class01;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 test = new Ex06();
		//System.out.println(test.name); 오류
		String s1 = test.k1();
		System.out.println(s1);
		
		int s2 = test.k2();
		System.out.println(s2);
		
		double s3 = test.k3();
		System.out.println(s3);
		
		char s4 = test.k4();
		System.out.println(s4);
		
		test.m1("고길동");
		System.out.println("이름 : " + test.k1());
		test.m2(37);
		System.out.println("나이 : " + test.k2());
		test.m3(170.4);
		System.out.println("나이 : " + test.k3());
		test.m4('B');
		System.out.println("나이 : " + test.k4());
	}

}
