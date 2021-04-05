package com.ict01.grammar03;
class Ex06{
	public static void main(String[] args) {
	
		// 중첩 삼항 연산자 : 삼항연산자가 중첩된 것.
		// char k1 이 대문자인지 , 소문자인지, 기타문자인지 판별하자
		char k1 = 'd';
		String res1 = (k1>='A'&&k1<='Z') ? "대문자" 
				: (k1>='a'&&k1<='z') ? "소문자" : "기타문자";
		System.out.println("결과 : " + res1);

		//int k2 가 90점이상이면 A학점, 80점이상이며 B학점 나머지는 F학점
		int k2 = 90;
		String res2 = k2>=90 ? "A" : k2>=80 ? "B" : "F";
		System.out.println("결과 : " + res2);
		
		//int k3가 1 또는 3이면 남자, 2또는 4이면 여자 , 나머지는 외국인
		int k3 = 1;
		String res3 = k3>=1&&k3<=4 ? (k3==1 || k3==3 ? "남자" : "여자") : "외국인";
		System.out.println("결과: " + res3);

	}
}