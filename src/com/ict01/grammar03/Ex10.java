package com.ict01.grammar03;
class Ex10{
	public static void main(String[] args) {
		//if~else~ : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		//형식  if(조건식){
		//	조건식이 참일때 실행할 문장;
		//        } else {
		//	조건식이 거짓일때 실행할 문장;
		//        }
		// 단, 실행할 문장이 한문장이면 생략 가능.

		//int k1 가 60이상이면 합격 아니면 불합격
		int k1 = 70;
		if (k1>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}


		//int k2이 홀수인지 짝수인지 판별하자

		int k2 = 7;
		if (k2%2==0){
			System.out.println("합격");
		}else{
			System.out.println("짝수");
		}			

		//char k3가 대문자인지 대문자가 아닌지 판별하자
		
		char k3 ='a';
		if (k3>='A'&&k3<='Z'){
			System.out.println("대문자");
		}else{
			System.out.println("소문자");
		}
		
		//k4가 1또는 3이면 남자 아니면 여자

		int k4 = 1;
		if (k4==1||k4==3){
			System.out.println("남자");
		}else{
			System.out.println("여자");
		}

		//근무시간이 8시간까지는 시간당 8720이고 8시간을 초과한 시간만큼은 1.5배이다.
		//현재 근무시간이 10시간이다. 얼마를 받아야하는가?

		int time = 10;
		int price = 8720;
		int pay=0;
		if(time>8){
			pay=(price*8)+(int)((price*1.5)*(time-8));
		}else{
			pay = price*time;
		}
		System.out.println(pay);


	}
}