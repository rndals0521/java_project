package com.ict01.grammar04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for �� : ������ ��Ģ�� ���� ���๮�� �ݺ�ó���ϴ¹�
		// ���� : for(�ʱ��; ���ǽ�; ������) {
		//			���ǽ��� ���϶� ������ ����;
		//			���ǽ��� ���϶� ������ ����;
		//        }
		//for ���� ������ ������ �ʱ������ �̵�. �ʱ�Ŀ����� ���ǽ����� �̵� . 
		//���ǽ��� ���̸� for���� ���� �����̸� for�� ����. for�� ���� �� for���� ���� ������ ������ ���������� ����

		// �ȳ��ϼ��� 10������ϱ�
		for ( int i =0;i<10;i++ )
		{
			System.out.println("�ȳ��ϼ���" + (i+1));
		}

		for (int i=0;i<=15;i++  )
		{
			System.out.print(i+"  ");
		}
		System.out.println();

		// 0-10 ���� ¦���� ���
		for(int i =0;i<11;i++){
			if (i%2==0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();

		// 0-10 ���� Ȧ���� ���
		for(int i =0;i<11;i++){
			if (i%2!=0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		// 0-50������ 7�� ����� ���
		for(int i =0;i<51;i++){
			if (i%7==0)
			{
				System.out.print(i + "  ");
			}
		}
		System.out.println();

		// 5�� ���
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

		// 0-10���� ������ ���ϱ�
		int sum=0;
		for (int i=0;i<11 ;i++ )
		{
			System.out.println(sum + " + " +i);
			sum += i;
		}
		System.out.println("��:" + sum);

		// Ȧ���� �����հ� ¦���� ������ ���ϱ�
		int sumH = 0,sumJ = 0;
		for(int i=0;i<11;i++){
			if(i%2==0)
				sumJ+=i;
			else
				sumH+=i;
		}

		System.out.println("¦����:" + sumJ + " , Ȧ����:" + sumH);

		// 7!(7*6*5*4*3*2*1

		int gop = 1;
		for(int i=7;i>0;i--){
			gop *= i;
		}
		System.out.println("7! = " + gop);
	}
}
