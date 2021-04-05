package com.ict03.class01;

public class Ex02 {
	// Ŭ���� �ȿ��� 3������ �����Ѵ�.
	// ����ʵ�, ����޼ҵ�, ������
	
	// ����ʵ� : ����� ����, static�� instance�� ����
	// final �����ϸ� ��� 
	// static ������ �ν��Ͻ�(��ü �����Ҷ� ���̸��������.)
	// static �̶� ��ä ������ ������� �̸� ���������.
	
	int k1 = 80;               //�ν��Ͻ� ���� == �Ϲ� ����
	static int k2 = 90;        //static ����   
	final int K3 = 85;         //�ν��Ͻ� ���
	static final int K4 = 95;  //static ��� = API���� �����ϴ� �������

	// ����޼ҵ� : ����, ���
	// �޼ҵ�� �ڱ⸦ ȣ���� ������ �ǵ��� ����.
	// �ν��Ͻ�, ��ȯ���� ����.(���� �����Ͱ� ����.)
	public void prn01() {
		// ���� ������ �� �����Ƿ� ����
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
		//K3 = K3 + 15;
		//K4 = K4 + 5; ����� �������� �ȵ�. final�� ������ ����̴�.
		
		// ���� ���� : �޼ҵ� �ȿ��� ������� ����
		//             �޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���Ҷ� �����ȴ�.
		//             �޼ҵ尡 ������ �������.
		//             ���������� static�� ���� �� ����.
		int s1 = 10;
		//static int s2 = 10;
		final int s3 = 30;
		//static final int s4 = 25;
		
	}
	// static, ��ȯ�� ����.
	public static void prn02() {
		//static �޼ҵ忡���� �ν��Ͻ������� ����� �� ����.
		//k1 = k1 + 20;
		k2 = k2 + 10;
		//K3 = K3 + 15;
		//K4 = K4 + 5;
		System.out.println("k2 = " + k2);
		System.out.println("k4 = " + K4);
		
		// ���������� static�� ���� �� ����.
		int s1 = 10;
		//static int s2 = 10;
		final int s3 = 30;
		//static final int s4 = 25;
	}
	// �ν��Ͻ�, ��ȯ���� ����
	public int prn03() {
		return 'c';  //��ȯ������ ���� �ڷ���
		//return 14; //��ȯ���̶� ���� �ڷ���
	}
	// static, ��ȯ�� �ִ�.
	public static double prn04() {
		return 147;
		//return 3.14;
	}
}
