package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {

		//static�� ��ü ������ ������� �̸� ���������.
		//ȣ���� Ŭ�����̸�.�޼ҵ�, Ŭ�����̸�.����
		//System.out.println(Ex02.k1); // �ν��Ͻ� �� ����
		System.out.println(Ex02.k2);
		//System.out.println(Ex02.K3); // �ν��Ͻ� �� ����
		System.out.println(Ex02.K4);
		
		//void�� ������ �Ѿ���� �ʴ´�.
		Ex02.prn02();
		
		//void�� �ƴϸ� �ݵ��, ��ȯ���� ���缭 ��������
		double su1 = Ex02.prn04();
		System.out.println(su1);
		
		System.out.println("====��ü ���� ���� ====");
		
		// 1. Ex02 Ŭ������ ����ϱ� ���ؼ� Ŭ������ ��ü�� ������
		// Ex02Ŭ������ �����ڰ� �������� �����Ƿ� �⺻�����ڷ� ��ü �����Ѵ�.
		// �⺻�����ڶ� �μ�=�Ű������� ���� ������('Ŭ�����̸�()')
		// Ŭ���� �������� = new ������;
		Ex02 ex02 = new Ex02();
		//ex02.prn01();
		System.out.println(ex02.k1);
		System.out.println(ex02.k2);
		System.out.println(ex02.K3);
		System.out.println(ex02.K4);
		
		System.out.println(ex02); //�ּ�
		
		// �޼ҵ� ����
		
	}

}
