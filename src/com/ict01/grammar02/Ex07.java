package com.ict01.grammar02;
class Ex07 {
	public static void main(String[] args) {
	
		// 이름이 홍길동인 사람의 국어90,영어80,수학90이다.
		// 총점과 평균을 구하시오.

		// 원하는 정보를 받기 : 입력
		String name = "홍길동";
		int hg = 90,he=80,hm=90;
		int total =0;
		double avr = 0;
		total = hg + he + hm;
		avr = (int)((total/3.0)*10) / 10.0;
		System.out.println("이름: "+name+" 총점: "+total+", 평균: "+avr);

				
	}
}