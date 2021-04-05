package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하라 1.고양이 OR 2.강아지");
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
		
		//부모클래스를 이용해서 선언
		Ex09_Animal animal = null;
		if(s1==1) {
			animal = new Ex10_Cat();
		}else if(s1==2) {
			animal = new Ex11_Dog();
		}
		
		// 특징 : 부모클래스에 없는 메소드는 사용불가
		animal.sound();
		//animal.hobby();
		animal.like();
		animal.sleep();
		
		
		
		
		
		
		
	}
}
