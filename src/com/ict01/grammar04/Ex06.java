package com.ict01.grammar04;
import java.util.Scanner;

class Ex06 
{
	public static void main(String[] args) 
	{
		//do ~ while�� : while���� ���� �ݺ��� ���� ���� �� ���߿� ���Ѵ�.
		//���� : 
		// �ʱ��;
		// do{
		//		������ ����;
		//		������;
		// }while(���ǽ�);

		// 0-10���� ���
		int i =0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i<11);
		System.out.println();

		// �ݺ�Ƚ���� �޾Ƽ� ó������

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ�Ƚ�� : " );
		int n = sc.nextInt();
		i=0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i<n);
		System.out.println();

		// �ݺ�Ƚ���� �Ϲ� ���ڸ� �޾Ƽ� Ȧ��,¦���� ���
		System.out.print("�ݺ�Ƚ�� : " );
		n = sc.nextInt();
		i=0;
		do
		{
			System.out.print("���ڸ� �Է��Ͻÿ� : " );
			int a = sc.nextInt();
			if(a%2==0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
			i++;
		}
		while (i<n);
	}
}
