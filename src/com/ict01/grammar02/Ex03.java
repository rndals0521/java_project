package com.ict01.grammar02;
class Ex03{
	public static void main(String[] args){
	
		//������ byte < short < int < long   �⺻���� int
		//���ǻ��� : byte, short�� �����ϸ� ����� ������ int �̻�

		//byte : -128 ~ 127  ���� ���ڸ� ��� ����
		byte s1 = -127;
		System.out.println(s1);
		s1 = -128;
		System.out.println(s1);
		//byte ������ ����� �����߻�
		//s1 = -129;
		System.out.println(s1);
		
		//short : -326,768 ~ 32767 �����ȿ� �����ϴ� ������ ����
		//���� ���
		//short s2 = 32760 + 100;  ������� �����
		//System.out.println(s2);

		// int �� long�� ������ �ܿ� �ʿ����.
		// ������ �Ϲ����� ������ int ���� ū ������ ����Ҷ� long long���� ���ڵڿ� L�̳�l�� ����(��������)
		int s3 = 117;
		long s4 = 117l;
		
		// �Ǽ� : �Ҽ����� �����ϴ� �� ������ ���������ٴ� ũ��.
		// �Ǽ� �⺻���� double    float�� ���� �ڿ� f  (�����ȵ�)
		// char < ����(int,long) < float < double ;

		float s7 = 3.14f;
		System.out.println(s7);
		double s8 = 3.18;
		System.out.println(s8);
		double s9 = 117;
		System.out.println(s9);
				
	}
}