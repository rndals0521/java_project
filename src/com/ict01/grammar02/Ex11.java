package com.ict01.grammar02;
class Ex11{
	public static void main(String[] args){
		
		//비교연산자 : 변수나 상수의 값을 비교할때 사용
		//	      결과는 항상 boolean 이다.
		//	       boolean 형은 조건식에 사용 자료형이  String인 경우 사용하지말자
		int s1 = 90;
		int s2 = 80;
		boolean res = s1 >= s2;
		System.out.println("결과 : " + res);

		char s3 = 'c';
		char s4 = 'a';
		res = s3 >= s4;
		System.out.println("결과 : " + res);

		res = 'a' >= 97;
		System.out.println("결과 : " + res);

		res = 97 >= 97.0;
		System.out.println("결과 : " + res);
		res = 97 >= 97.000001;
		System.out.println("결과 : " + res);

		//String은 비교하는 메소드가 별도로 존재한다.

	}
}