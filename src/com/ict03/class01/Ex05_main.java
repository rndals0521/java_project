package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static�� ��ü ������ ������� ��밡��
		// Ŭ�����̸�.����ʵ�, Ŭ�����̸�.����޼ҵ�
		System.out.println(Ex05.s3);
		//System.out.println(Ex05.s4); //static�̶� private�� ������ �� ����.
		
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.s1);
		//System.out.println(ex05.s2);  //private ���پȵ�
		System.out.println(ex05.s3);
		
		//�޼ҵ�鵵 ��������
		ex05.add();
		//ex05.add2(); �����̾ȵ� �׷��� ������ ����.
		ex05.add3();
	}

}
