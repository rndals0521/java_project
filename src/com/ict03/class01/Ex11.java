package com.ict03.class01;

public class Ex11 {
	
	// ������ : Ŭ������ ��ü�� ���鶧 �ڵ����� �ѹ� ȣ��ȴ�.
	//   ���� : ����ʵ�(������ ���)�� �ʱ�ȭ
	//   Ư¡ : Ŭ�����̸��� �������̸��� ����.
	//          Ŭ�����̸�([����=�Ű�����]);
	//          ��ȯ���� ���� �޼ҵ����� �Ѵ�.
	//          �����ڸ� ������ ������ �ڵ����� �⺻�����ڷ� ��ü�� �����Ѵ�.
	//          �⺻�����ڶ� ���ڰ� ���� �����ڸ� ���Ѵ�. ('Ŭ�����̸�()')
	//          Ŭ�����ȿ��� �����ڸ� ��������� ������� �����ڸ� ����ؾ��Ѵ�.
	//          �����ڵ� �����ε��� �ȴ�.(�ϳ��� Ŭ������ �������� �����ڰ� ������ �� �ִ�. ��, ������ ������ ����,������ �޶����)
	//          �����ε��̶� �ϳ��� Ŭ�����ȿ� �����̸��� �޼ҵ尡 ������ �����ϴ� ��.
	
	private String name = "�Ѹ�";
	private int age = 24;
	private boolean gender = true;
	// �⺻������
	
	public Ex11() {
		System.out.println("�⺻������");
		name="�±Ǻ���";
		age=142;
		
	}
	
	// �⺻�����ڰ� �ƴ� �ٸ� ������ (��, ���ڰ� �ִ� ������ ����)
	public Ex11(String name, int age) {
		System.out.println(1);
		this.name = name;
		this.age = age;
	}
	
	public Ex11(int age ,String name) {  //������ �ٲٸ� ������ ���� �ʴ´�..!
		System.out.println(2);
		this.name = name;
		this.age = age;
	}
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	

	
}