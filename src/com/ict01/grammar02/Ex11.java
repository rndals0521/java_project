package com.ict01.grammar02;
class Ex11{
	public static void main(String[] args){
		
		//�񱳿����� : ������ ����� ���� ���Ҷ� ���
		//	      ����� �׻� boolean �̴�.
		//	       boolean ���� ���ǽĿ� ��� �ڷ�����  String�� ��� �����������
		int s1 = 90;
		int s2 = 80;
		boolean res = s1 >= s2;
		System.out.println("��� : " + res);

		char s3 = 'c';
		char s4 = 'a';
		res = s3 >= s4;
		System.out.println("��� : " + res);

		res = 'a' >= 97;
		System.out.println("��� : " + res);

		res = 97 >= 97.0;
		System.out.println("��� : " + res);
		res = 97 >= 97.000001;
		System.out.println("��� : " + res);

		//String�� ���ϴ� �޼ҵ尡 ������ �����Ѵ�.

	}
}