package com.ict03.class03;

public class Ex10_Cat extends Ex09_Animal{

	String name = "��ȫ��";
	int age = 1;
	
	
	public void hobby() {
		System.out.println("������");
	}
	
	@Override //������̼��� �ǹ̰� �ִ� �ּ�, JVM�� �˾ƺ�
	public void sound() {
		
		System.out.println("�߿�����");
	}
}
