package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args) {
	
		//���ڵ��� ũ�⿡ ���� �������
		//����ȯ : �ڵ�����ȯ�� ��������ȯ
		
		//�ڵ�����ȯ : ���� �ڷ����� ū �ڷ����� ����� ��
		//char �� int �� ������ �� �ִ�.
		char c1 = 'a';
		int a1 = 'a';
		System.out.println(a1);
		int a2 = c1;
		System.out.println(a2);
		//int�� long�� ������ �� �ִ�.
		long a3 = 117;
		long a4 = 117L;
		//long�� float�� double���� ���� �� �� �ִ�.
		float a5 = a4;
		System.out.println(a5);
			

		//��������ȯ : ū�ڷ����� ���� �ڷ������� ���� �� ������ �߻�
		//	      ������ �� ��ȯ�� �ؼ� ������ ���� �ʰ� �Ѵ�.
		//	      �׷��� ������ �սǰ��ɼ��� �ִ�.
		// ��������ȯ��� : = �� �������� ������ ���� �ڷ����� ����� = (�����ڷ���)(���);
		byte k1 = (byte)129;
		System.out.println(k1);

		// int �� char�� ����
		char k2 = 97;
		System.out.println(k2);

		int k3 = 97;
		char k4 = (char)k3;
		System.out.println(k4);

		// float�� double�� int�� ����
		int k5 = (int)15.3;
		System.out.println(k5);

		//�Ҽ��� ù°�ڸ����� ������
		int k6 = (int)(87.64*10);
		System.out.println(k6/10.0);
		
	}
}