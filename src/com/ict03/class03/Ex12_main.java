package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����϶� 1.����� OR 2.������");
		int s1 = sc.nextInt();
		/*
		if(s1==1) {
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound();
			cat.hobby();
			cat.like();
			cat.sleep();
		}else if(s1==2) {
			Ex11_Dog dog = new Ex11_Dog();
			dog.sound();
			dog.hobby();
			dog.like();
			dog.sleep();
		}
		*/
		
		//�θ�Ŭ������ �̿��ؼ� ����
		Ex09_Animal animal = null;
		if(s1==1) {
			animal = new Ex10_Cat();
		}else if(s1==2) {
			animal = new Ex11_Dog();
		}
		
		// Ư¡ : �θ�Ŭ������ ���� �޼ҵ�� ���Ұ�
		animal.sound();
		//animal.hobby();
		animal.like();
		animal.sleep();
		
		
		
		
		
		
		
	}
}
