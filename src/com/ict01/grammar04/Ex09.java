package com.ict01.grammar04;
import java.util.Scanner;


class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 1-10���� ¦���� ��� (continue ����ؼ�)
		for (int i = 1;i<11 ; i++)
		{
			if(i%2==0) continue;
			System.out.println(i);
		}
		// ���ѷ������� ���ڸ� �޾Ƽ� ¦��,Ȧ�� �Ǻ�
		// for(; ; ) -> for���� ���ѷ���
		while(true){
			System.out.println("���� �Է��Ͻÿ�.");
			int n = sc.nextInt();
			String msg = "";
			if(n%2==0)
				msg = "¦��";
			else
				msg = "Ȧ��";
			
			System.out.println(n + " �� " + msg);
			System.out.print("��� �ұ��?(1.yes)(2.no)");
			int n2 = sc.nextInt();
			if(n2==2)  break;
			
		}

	}
}
