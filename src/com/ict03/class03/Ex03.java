package com.ict03.class03;

//Ex02�� Ex03�� ��Ӱ���
public class Ex03 extends Ex02{
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ� Ŭ���� ������ : "+this);
	}
	
	public void sound() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		//��ü �������� �θ�Ŭ������ ����� ����Ѱ�.
		System.out.println("������� : " + addr);
		
		System.out.println("name : " + this.name); //���θ�
		//�̸��� ���� �� super�� ���̸� �θ�� �������°�
		System.out.println("name : " + super.name); //������
		
		//System.out.println("�츮�� �ֿϵ��� : " +dog);
		//��Ӱ���� private�� ����Ҽ� ����.
		
	}
	
	// �������̵� : �θ�޼ҵ带 �Ѹ���� �״�� ����ϸ鼭,
	// (������)     ���븸 �����ϴ� ��.
	@Override
	public void eat() {
		System.out.println("��ħ���� �����Ѵ�.");
	}
	
	/*
	@Override
	public void walk() {
		System.out.println("�Ϸ翡 ������ 1�ð��� ��å");
	}*/ //����
	// �������̵��� �� �� ���� �ϴ� ����� : final
	// �θ� �޼ҵ忡 final ������ override �� �� ����.
	
	
}