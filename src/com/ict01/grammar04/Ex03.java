package com.ict01.grammar04;
class Ex03
{
	public static void main(String[] args) 
	{
		//다중 for문 : for문안에 for문이 존재한다.
		for (int i=1; i<4; i++ )
		{
			for(int j=1;j<6;j++)
			{

				System.out.println("i="+i+", j="+j);
			}
		}
		for(int i=1;i<10;i++)
		{
			System.out.println(i+"단");
			for (int j=1;j<10 ;j++ )
			{
				System.out.println(i + " X " + j + " = " + (i*j)+" ");
			}
			System.out.println();
		}

		for(int i=1;i<10;i++)
		{
			for (int j=1;j<10 ;j++ )
			{
				System.out.print(i + " X " + j + " = " + (i*j)+" ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i=1;i<10;i++)
		{
			for (int j=1;j<10 ;j++ )
			{
				System.out.print(j + " X " + i + " = " + (i*j)+" ");
			}
			System.out.println();
		}

		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		
		for(int i=0;i<4;i++)
		{
			for (int j=0; j<4; j++)
			{
				if(j==i)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " " );
			}
			System.out.println();
		}
	}
}
