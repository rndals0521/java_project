package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
		//Ex11 test1 = new Ex11(); -> Ex11 �⺻�����ڰ� �ƴ� �ٸ������ڰ� �ֱ� ������ ����
		//�ٸ������ڷ� ��ü ������ �ؾ��Ѵ�.
		Ex11 test1 = new Ex11("ȫ�浿",34);
		
		System.out.println("�̸�:" + test1.getName() + " ����:"+test1.getAge()+" ����:"+test1.isGender());
		
		
		//Ex11 test2 = new Ex11(); -> ��������
		Ex11 test2 = new Ex11(89,"�����");
		System.out.println("�̸�:" + test2.getName() + " ����:"+test2.getAge()+" ����:"+test2.isGender());
		
		//setter�� �̿��ؼ� ����ʵ��� ���� ������ �� �ִ�.
		test2.setName("������");
		System.out.println("�̸�:" + test2.getName() + " ����:"+test2.getAge()+" ����:"+test2.isGender());
		
	}
}
