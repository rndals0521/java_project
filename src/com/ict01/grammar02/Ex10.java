package com.ict01.grammar02;
class Ex10{
	public static void main(String[] args) {
		
		//증감연산자 : 1만큼 증가하거나 감소시키는 연산자이다.
		//                char,정수,실수에 사용가능
		//++ 변수 현재변수값에 1을 증가시키고 나머지 연산 변수++ 현재변수값을 가지고 연산한 후 나중에 1 증가
		int s1 = 10;
		int s2 = 10;
		System.out.println(++ s1 + 2);
		System.out.println(s2++ + 2);
		System.out.println();
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);		
	}
}