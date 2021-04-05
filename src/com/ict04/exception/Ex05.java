package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) //throws NumberFormatException ���ο����� �ѱ�� ������ �ǵ��� �׷����� ����
	{
		// throws (���� �絵, ��������)
		// -���ܰ� �߻��ϸ� ����ó���� ���� �ʰ�, �ڽ��� ȣ���� ������ ���� ��ü�� �����ϴ� ��
		// -���߿��� ����ó��(try~catch)�� �ϴ� ���� ����.
		
		
		Ex05 test = new Ex05();
		Scanner sc = new Scanner(System.in);
		try {			
			System.out.println("�����Է� : ");
			String message = sc.next();
			test.setData(message);
		} catch (Exception e) {
			System.out.println("����� �Է���");
		}
	}

	public void setData(String msg) throws NumberFormatException {
		//msg�� ������ ���̰� �Ѱ� �̻��̸� ����
		if(msg.length()>=1) {
			String str = msg.substring(0,1); // ù���ڸ� �����ض�
			prnData(str);
		}
	}
	
	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "��");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
