package com.ict01.grammar04;
import java.util.Scanner;


class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 1-10까지 짝수만 출력 (continue 사용해서)
		for (int i = 1;i<11 ; i++)
		{
			if(i%2==0) continue;
			System.out.println(i);
		}
		// 무한루프에서 숫자를 받아서 짝수,홀수 판별
		// for(; ; ) -> for문의 무한루프
		while(true){
			System.out.println("숫자 입력하시오.");
			int n = sc.nextInt();
			String msg = "";
			if(n%2==0)
				msg = "짝수";
			else
				msg = "홀수";
			
			System.out.println(n + " 는 " + msg);
			System.out.print("계속 할까요?(1.yes)(2.no)");
			int n2 = sc.nextInt();
			if(n2==2)  break;
			
		}

	}
}
