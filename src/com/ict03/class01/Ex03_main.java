package com.ict03.class01;

public class Ex03_main {

	public static void main(String[] args) {
		//Ex03 Ŭ������ ��ü�� ������
		Ex03 ex03 = new Ex03();
		
		// plus01�� void�̹Ƿ� ���� �� ����.
		System.out.println(1);
		ex03.plus01();
		System.out.println(2);
		System.out.println(ex03.result);
		
		// sub01�� ��ȯ���� int�̹Ƿ� ���� ������ int�� ������
		int sub = ex03.sub01();
		System.out.println(sub);

	}

}
