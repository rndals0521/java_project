package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		
		Ex08 coffee = new Ex08();
		coffee.setName("커피음료");
		coffee.setPrice(1800);
		
		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2200);
		
		// 배열에 넣자
		// 자료형[] 이름 = new 자료형[크기];
		/*
		Ex08[] arr = new Ex08[4];
		arr[0] = coffee;
		arr[1] = ion;
		arr[2] = cola;
		arr[3] = juice;
		*/
		Ex08[] arr = {coffee,ion,cola,juice};
		
		// arr[]이 가지고 있는 이름과 가격을 출력하자
		/*
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ", " + arr[i].getPrice());
		}
		*/
		
		//동전 투입
		Scanner sc = new Scanner(System.in);
		System.out.print("금액입력:");
		int input = sc.nextInt();
		if(input<1500) {
			System.out.println("금액부족");
		}else {
			System.out.println("1.커피\t2.이온\t3.탄산\t4.과일");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() <= input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}
		}
		
		System.out.println();
		
		int output = 0;
		do {
			System.out.println("번호로 선택하세요 >> ");
			int drink = sc.nextInt();
			if(drink==1) {
				input = input - arr[0].getPrice();
			}else if(drink==2) {
				input = input - arr[1].getPrice();
			}else if(drink==3) {
				input = input - arr[2].getPrice();
			}else if(drink==4) {
				input = input - arr[3].getPrice();
			}else if(drink==0){
				break;
			}
			System.out.println("잔돈 : " + input);
		}while(input>1500);
		//숙제 잔돈이 남았을때
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
