package com.ict01.grammar03;
import java.util.Scanner;

class Ex07{
	public static void main(String[] args) {
		//Scanner Ŭ���� �˾ƺ���
		//Scanner �� �Ҽ��� java.util.Scanner �̴�. 
		//java.lang�� �Ҽӵ� Ŭ���� ������� ��������� �̿ܿ� Ŭ������ �Ҽ��� ǥ���ؾ� �ȴ�.(import)
		// Ŭ���� �ȿ��� Constructor(������), Method(�޼���), Field(�ʵ�)
		// method => ����/���/�ϴ� ��
		
		// Ű���忡 �Էµ� ������ sc�� ����
		Scanner sc = new Scanner(System.in);

		System.out.print("����� �̸� : " );
		String name = sc.next();
		System.out.print("���� ���� : " );
		int kor = sc.nextInt();
		System.out.print("���� ���� : " );
		int eng= sc.nextInt();
		System.out.print("���� ���� : " );
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		System.out.println("���� : "  + sum);

		//���� ������ double
		System.out.print("����� Ű : " );
		double height = sc.nextDouble();
		System.out.println(height);

		//���� ������ boolean������ ���
		System.out.print("����� �����Դϱ�?(true/false)");
		boolean gender = sc.nextBoolean();
		String str = gender ? "����" : "����";
		System.out.println(str);
	}
}