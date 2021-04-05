package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex10 ratte = new Ex10();
		ratte.setMenu("카페라떼");
		ratte.setPrice(3000);
		Ex10 americano = new Ex10();
		americano.setMenu("아메리카노");
		americano.setPrice(2500);
		Ex10 moca = new Ex10();
		moca.setMenu("카페모카");
		moca.setPrice(3500);
		Ex10 jamong = new Ex10();
		jamong.setMenu("자몽주스");
		jamong.setPrice(3000);
		
		
		Ex10[] arr = {ratte,americano,moca,jamong};
		
		System.out.print("인원 수를 입력하세요:");
		int count = sc.nextInt();
		int sum=0;
		for (int i = 0; i < count; i++) {
			System.out.println("1.카페라떼\t2.아메리카노\t3.카페모카\t4.자몽주스");
			System.out.print("메뉴를 고르세요:");
			int n= sc.nextInt();
			sum += arr[n-1].getPrice();
		}
		
		System.out.println("총액:" + sum);
		System.out.print("투입 금액 입력:");
		int input = sc.nextInt();
		if(input>sum)
			System.out.println("잔금 : " + (input-sum));
		else
			System.out.println("금액 부족 !");
		
		
		
		//강사님 ver
		//Scanner scan = new Scanner(System.in);
		System.out.print("인우너수:");
		int su = sc.nextInt();
		//상품명과 가격 (Ex10)을 가지는 배열
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1.아메리카노(2500)");
			System.out.println("2.카페모카(3000)");
			System.out.println("3.카페라떼(3500)");
			System.out.println("4.자몽주스(3000)");
			System.out.println("선택하셍>>>");
			int menu = sc.nextInt();
			Ex10 product = new Ex10();
			if(menu ==1) {
				product.setMenu("아메리카노");
				product.setPrice(2500);
			}else if(menu==2) {
				product.setMenu("카페모카");
				product.setPrice(3000);
			}else if(menu==3) {
				product.setMenu("카페라떼");
				product.setPrice(3500);
			}else if(menu==4) {
				product.setMenu("자몽주스");
				product.setPrice(3000);
			}
			offer[i] = product;
		}
		//전체금액
		int sum2 = 0;
		for (int i = 0; i < offer.length; i++) {
			sum2 = sum2 + offer[i].getPrice();
		}
		System.out.println("총 액 : " + sum2);
		System.out.print("입금액 : ");
		int input2 = sc.nextInt();
		System.out.println("잔돈 : " + (input2-sum2));
	}

}
