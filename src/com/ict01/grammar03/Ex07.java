package com.ict01.grammar03;
import java.util.Scanner;

class Ex07{
	public static void main(String[] args) {
		//Scanner 클래스 알아보기
		//Scanner 의 소속은 java.util.Scanner 이다. 
		//java.lang의 소속된 클래스 마음대로 사용했지만 이외에 클래스느 소속을 표시해야 된다.(import)
		// 클래스 안에는 Constructor(생성자), Method(메서드), Field(필드)
		// method => 동작/기능/하는 것
		
		// 키보드에 입력된 내용이 sc에 저장
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름 : " );
		String name = sc.next();
		System.out.print("국어 점수 : " );
		int kor = sc.nextInt();
		System.out.print("영어 점수 : " );
		int eng= sc.nextInt();
		System.out.print("수학 점수 : " );
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		System.out.println("총점 : "  + sum);

		//들어온 정보를 double
		System.out.print("당신의 키 : " );
		double height = sc.nextDouble();
		System.out.println(height);

		//들어온 정보를 boolean형으로 기억
		System.out.print("당신은 남성입니까?(true/false)");
		boolean gender = sc.nextBoolean();
		String str = gender ? "남성" : "여성";
		System.out.println(str);
	}
}