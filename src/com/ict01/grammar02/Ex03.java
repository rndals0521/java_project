package com.ict01.grammar02;
class Ex03{
	public static void main(String[] args){
	
		//정수형 byte < short < int < long   기본값은 int
		//주의사항 : byte, short를 연산하면 결과는 무조건 int 이상

		//byte : -128 ~ 127  사이 숫자만 사용 가능
		byte s1 = -127;
		System.out.println(s1);
		s1 = -128;
		System.out.println(s1);
		//byte 범위가 벗어나서 오류발생
		//s1 = -129;
		System.out.println(s1);
		
		//short : -326,768 ~ 32767 범위안에 존재하는 정수를 저장
		//범위 벗어남
		//short s2 = 32760 + 100;  결과값이 저장됨
		//System.out.println(s2);

		// int 와 long의 범위를 외울 필요없다.
		// 앞으로 일반적인 정수는 int 아주 큰 정수를 사용할때 long long에는 숫자뒤에 L이나l을 붙임(생략가능)
		int s3 = 117;
		long s4 = 117l;
		
		// 실수 : 소숫점이 존재하는 수 무조건 정수형보다는 크다.
		// 실수 기본형은 double    float는 숫자 뒤에 f  (생략안됨)
		// char < 정수(int,long) < float < double ;

		float s7 = 3.14f;
		System.out.println(s7);
		double s8 = 3.18;
		System.out.println(s8);
		double s9 = 117;
		System.out.println(s9);
				
	}
}