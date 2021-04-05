package com.ict01.grammar04;
class Ex04 
{
	public static void main(String[] args) 
	{
		// while 문 : for과 같은 반복문
		// 형식1)                                    형식2)
		// 초기식;									 초기식;
		// while(조건식) {                           while(true){
		//   조건식이 참일때 실행할문장					if(빠져나갈조건) break; (먼저탈출)
		//   조건식이 참일때 실행할 문장				조건식이 참일때 실행할문장
		//   증감식;									조건식이 참일때 실행할문장
		// }											if(빠져나갈조건) break; (나중탈출)
		//											    증감식;
		//											 }  ** if문 둘중 한개 쓰는거임

		// **while문 끝을 만나면 조건식으로 이동해라
		
		//0-15까지 출력하자
		int i = 0;
		while (i<16)
		{
			System.out.println(i);
			i++;
		}

		i=0;
		while(true)
		{
			if(i>15) break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		//0-10까지 홀수만 출력
		i = 0;
		while (i<11)
		{
			if(i%2==0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();

		i=0;
		while(true)
		{
			if(i>10) break;
			if(i%2==0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();
		//0-10까지 착수만 출력
		i = 0;
		while (i<11)
		{
			if(i%2!=0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();

		i=0;
		while(true)
		{
			if(i>10) break;
			if(i%2!=0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();
		// 0-50까지의 7의 배수만 출력
		i=0;
		while (i<51)
		{
			if(i%7==0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();
		i=0;
		while(true)
		{
			if(i>50) break;
			if(i%7==0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println();
		// 5단 출력
		i=1;
		while (i<10)
		{

			System.out.print("5" + "X" + i + "=" + (i*5) + " ");
			i++;
		}
		System.out.println();

		i=0;
		while(true)
		{
			if(i>10) break;
			System.out.print("5" + "X" + i + "=" + (i*5) + " ");
			i++;
		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		i=1;
		while(i<17)
		{
			System.out.print("0 ");
			if(i%4==0)
				System.out.println();
			i++;
		}
		System.out.println();

		i=0;
		int j=0;
		while(i<4)
		{
			while(j<4)
			{
				System.out.print(0 + " ");
				j++;
			}
			j=0;
			i++;
			System.out.println();
		}
		System.out.println();

		i=0;
		j=0;
		while(true)
		{
			while(true)
			{
				if(j>3) break;
				System.out.print(0 + " ");
				j++;
			}
			i++;
			if(i>3) break;
			j=0;
			System.out.println();
		}
		System.out.println();

		// 0-10까지 누적합 구하기
		i=0;
		int sum = 0;
		while(i<11)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);

		i=0;
		sum = 0;
		while (true)
		{
			sum+=i;
			i++;
			if(i>10) break;
		}
		System.out.println(sum);

		// 홀수의 누적합과 짝수의 누적합 구하기
		i=0;
		int sum1 = 0,sum2=0;
		while(i<11)
		{	
			if(i%2==0)
				sum2+=i;
			else
				sum1+=i;
			i++;
		}
		System.out.println("홀수합:" + sum1 + ",짝수합:" + sum2);

		i=0;
		sum1 = 0;sum2=0;
		while(true)
		{	
			if(i%2==0)
				sum2+=i;
			else
				sum1+=i;
			i++;
			if(i>10) break;
		}
		System.out.println("홀수합:" + sum1 + ",짝수합:" + sum2);
	}
}
