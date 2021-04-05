package com.ict01.grammar04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for 문 : 정해진 규칙에 따라 실행문을 반복처리하는문
		// 형식 : for(초기식; 조건식; 증감식) {
		//			조건식이 참일때 실행할 문장;
		//			조건식이 참일때 실행할 문장;
		//        }
		//for 문을 만나면 무조건 초기식으로 이동. 초기식에서는 조건식으로 이동 . 
		//조건식이 참이면 for문을 실행 거짓이면 for문 종료. for문 실행 중 for문의 끝을 만나면 무조건 증감식으로 가라

		// 안녕하세요 10번출력하기
		for ( int i =0;i<10;i++ )
		{
			System.out.println("안녕하세요" + (i+1));
		}

		for (int i=0;i<=15;i++  )
		{
			System.out.print(i+"  ");
		}
		System.out.println();

		// 0-10 까지 짝수만 출력
		for(int i =0;i<11;i++){
			if (i%2==0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();

		// 0-10 까지 홀수만 출력
		for(int i =0;i<11;i++){
			if (i%2!=0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		// 0-50까지의 7의 배수만 출력
		for(int i =0;i<51;i++){
			if (i%7==0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();

		// 5단 출력
		for (int i=0;i<10 ;i++ )
		{
			System.out.print("5 * " + i + " = " +(i*5)+ " ");
		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(0 + " ");
			}
			System.out.println();
		}

		// 0-10까지 누적합 구하기
		int sum=0;
		for (int i=0;i<11 ;i++ )
		{
			System.out.println(sum + " + " +i);
			sum += i;
		}
		System.out.println("합:" + sum);

		// 홀수의 누적합과 짝수의 누적합 구하기
		int sumH = 0,sumJ = 0;
		for(int i=0;i<11;i++){
			if(i%2==0)
				sumJ+=i;
			else
				sumH+=i;
		}

		System.out.println("짝수합:" + sumJ + " , 홀수합:" + sumH);

		// 7!(7*6*5*4*3*2*1

		int gop = 1;
		for(int i=7;i>0;i--){
			gop *= i;
		}
		System.out.println("7! = " + gop);
	}
}
