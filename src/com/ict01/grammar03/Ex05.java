package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args) {
		//int k1가 60이상이면 합격 아니면 불합격
		int k1 = 60;
		String result1 = k1>=60 ? "합격" : "불합격";
		System.out.println("결과 : " + result1);
		
		//int k2이 홀수인지 짝수인지 판별하자
		int k2 = 3;
		String result2 = k2%2==0 ? "짝수" : "홀수";
		System.out.println("결과 : " +result2);

		//char k3가 대문자인지 대문자가 아닌지 판별하자
		char k3 = 'd';
		String result3 = k3>='A' && k3<='Z' ? "대문자" : "대문자아님";
		System.out.println("결과 : " + result3);

		//근무시간이 8시간까지는 시간당 8720이고 8시간을 초과한 시간만큼은 1.5배이다.
		//현재 근무시간이 10시간이다. 얼마를 받아야하는가?
		int time = 10;
		int price = 8720;
		int result4 = time <= 8 ? (price*time) : (int)((price*8)+((price*1.5)*(time-8)));
		System.out.println("결과 : " + result4 + " 원");
		
	}
}