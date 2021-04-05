package com.ict01.grammar03;
import java.util.Scanner;

class Ex08{
	public static void main(String[] argd) {

		Scanner sc = new Scanner(System.in);
		//숫자를 받아서 홀수, 짝수를 구분하자
		System.out.print("숫자를 입력: " );
		int a = sc.nextInt();
		String str1 = a%2==0 ? "짝수" : "홀수";
		System.out.println(str1);
		
		//국영수 점수를 받아 점수 평균이 60 이상이고, 각각 점수가 40이상일 때 합격 아니면 불합격
		System.out.print("국어 점수: ");	
		double kor = sc.nextDouble();
		System.out.print("영어 점수: ");	
		double eng = sc.nextDouble();
		System.out.print("수학 점수: ");	
		double math = sc.nextDouble();

		double avg = (kor + eng + math)/3.0;
		String str2 = kor>=40&&math>=40&&eng>=40&&avg>=60 ? "합격" : "불합격";
		System.out.println("결과 : " + str2);

		//알바시간을 입력받아 8시간 까지는 시간당 8720이고 8시간을 초과한 시간만큼은 1.5배 받을 금액은?
		System.out.print("알바시간 : ");
		int time = sc.nextInt();
		int price = 8720;
		int cost = time >=8 ? ((price*8)+(int)((price*1.5)*(time-8))) : price*time;
		System.out.println("받을 금액 : " + cost + "원");
	}
}