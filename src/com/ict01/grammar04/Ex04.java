package com.ict01.grammar04;
class Ex04 
{
	public static void main(String[] args) 
	{
		// while �� : for�� ���� �ݺ���
		// ����1)                                    ����2)
		// �ʱ��;									 �ʱ��;
		// while(���ǽ�) {                           while(true){
		//   ���ǽ��� ���϶� �����ҹ���					if(������������) break; (����Ż��)
		//   ���ǽ��� ���϶� ������ ����				���ǽ��� ���϶� �����ҹ���
		//   ������;									���ǽ��� ���϶� �����ҹ���
		// }											if(������������) break; (����Ż��)
		//											    ������;
		//											 }  ** if�� ���� �Ѱ� ���°���

		// **while�� ���� ������ ���ǽ����� �̵��ض�
		
		//0-15���� �������
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

		//0-10���� Ȧ���� ���
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
		//0-10���� ������ ���
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
		// 0-50������ 7�� ����� ���
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
		// 5�� ���
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

		// 0-10���� ������ ���ϱ�
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

		// Ȧ���� �����հ� ¦���� ������ ���ϱ�
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
		System.out.println("Ȧ����:" + sum1 + ",¦����:" + sum2);

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
		System.out.println("Ȧ����:" + sum1 + ",¦����:" + sum2);
	}
}