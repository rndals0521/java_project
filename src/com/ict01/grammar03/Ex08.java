package com.ict01.grammar03;
import java.util.Scanner;

class Ex08{
	public static void main(String[] argd) {

		Scanner sc = new Scanner(System.in);
		//���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������
		System.out.print("���ڸ� �Է�: " );
		int a = sc.nextInt();
		String str1 = a%2==0 ? "¦��" : "Ȧ��";
		System.out.println(str1);
		
		//������ ������ �޾� ���� ����� 60 �̻��̰�, ���� ������ 40�̻��� �� �հ� �ƴϸ� ���հ�
		System.out.print("���� ����: ");	
		double kor = sc.nextDouble();
		System.out.print("���� ����: ");	
		double eng = sc.nextDouble();
		System.out.print("���� ����: ");	
		double math = sc.nextDouble();

		double avg = (kor + eng + math)/3.0;
		String str2 = kor>=40&&math>=40&&eng>=40&&avg>=60 ? "�հ�" : "���հ�";
		System.out.println("��� : " + str2);

		//�˹ٽð��� �Է¹޾� 8�ð� ������ �ð��� 8720�̰� 8�ð��� �ʰ��� �ð���ŭ�� 1.5�� ���� �ݾ���?
		System.out.print("�˹ٽð� : ");
		int time = sc.nextInt();
		int price = 8720;
		int cost = time >=8 ? ((price*8)+(int)((price*1.5)*(time-8))) : price*time;
		System.out.println("���� �ݾ� : " + cost + "��");
	}
}