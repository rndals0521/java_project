package com.ict01.grammar04;
import java.util.Scanner;

class Ex06 
{
	public static void main(String[] args) 
	{
		//do ~ while문 : while문과 같은 반복문 먼저 실행 후 나중에 비교한다.
		//형식 : 
		// 초기식;
		// do{
		//		실행할 문장;
		//		증감식;
		// }while(조건식);

		// 0-10까지 출력
		int i =0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i<11);
		System.out.println();

		// 반복횟수를 받아서 처리하자

		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수 : " );
		int n = sc.nextInt();
		i=0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i<n);
		System.out.println();

		// 반복횟수와 일반 숫자를 받아서 홀수,짝수를 출력
		System.out.print("반복횟수 : " );
		n = sc.nextInt();
		i=0;
		do
		{
			System.out.print("숫자를 입력하시오 : " );
			int a = sc.nextInt();
			if(a%2==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
			i++;
		}
		while (i<n);
	}
}
