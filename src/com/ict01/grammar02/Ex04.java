package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args) {
	
		//숫자들의 크기에 따른 저장원리
		//형변환 : 자동형변환과 강제형변환
		
		//자동형변환 : 작은 자료형이 큰 자료형에 저장될 때
		//char 를 int 에 저장할 수 있다.
		char c1 = 'a';
		int a1 = 'a';
		System.out.println(a1);
		int a2 = c1;
		System.out.println(a2);
		//int를 long에 저장할 수 있다.
		long a3 = 117;
		long a4 = 117L;
		//long이 float나 double형에 저장 할 수 있다.
		float a5 = a4;
		System.out.println(a5);
			

		//강제형변환 : 큰자료형을 작은 자료형으로 저장 시 오류가 발생
		//	      강제로 형 변환을 해서 오류를 나지 않게 한다.
		//	      그러나 데이터 손실가능성이 있다.
		// 강제형변환방법 : = 를 기준으로 무조건 왼쪽 자료형에 맞춘다 = (왼쪽자료형)(대상);
		byte k1 = (byte)129;
		System.out.println(k1);

		// int 를 char에 넣자
		char k2 = 97;
		System.out.println(k2);

		int k3 = 97;
		char k4 = (char)k3;
		System.out.println(k4);

		// float나 double을 int로 저장
		int k5 = (int)15.3;
		System.out.println(k5);

		//소수점 첫째자리까지 구하자
		int k6 = (int)(87.64*10);
		System.out.println(k6/10.0);
		
	}
}