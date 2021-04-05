package com.ict01.grammar02;
class Ex02{
	public static void main(String[] args){
		//문자형 ,한글자 저장(한글,한자,특수문자 처리가능)
		// 문자사용위해 홀따옴표 , 숫자 사용가능 최종 저장은 숫자로 저장 연산가능 호출시 문자로 나옴
		char k1;
		k1 = 'a'+1;
		System.out.println(k1);
		k1 = 65+32;
		System.out.println(k1);

		// 문자를 대표하는 코드 : ASCII, 유니코드
		// 영어만 표현 ASCII 나머지는 유니코드
		char k2 ='대';
		System.out.println(k2);
		k2 = '對';
		System.out.println(k2);
	}
}