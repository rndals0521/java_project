package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex10 ratte = new Ex10();
		ratte.setMenu("ī���");
		ratte.setPrice(3000);
		Ex10 americano = new Ex10();
		americano.setMenu("�Ƹ޸�ī��");
		americano.setPrice(2500);
		Ex10 moca = new Ex10();
		moca.setMenu("ī���ī");
		moca.setPrice(3500);
		Ex10 jamong = new Ex10();
		jamong.setMenu("�ڸ��ֽ�");
		jamong.setPrice(3000);
		
		
		Ex10[] arr = {ratte,americano,moca,jamong};
		
		System.out.print("�ο� ���� �Է��ϼ���:");
		int count = sc.nextInt();
		int sum=0;
		for (int i = 0; i < count; i++) {
			System.out.println("1.ī���\t2.�Ƹ޸�ī��\t3.ī���ī\t4.�ڸ��ֽ�");
			System.out.print("�޴��� ������:");
			int n= sc.nextInt();
			sum += arr[n-1].getPrice();
		}
		
		System.out.println("�Ѿ�:" + sum);
		System.out.print("���� �ݾ� �Է�:");
		int input = sc.nextInt();
		if(input>sum)
			System.out.println("�ܱ� : " + (input-sum));
		else
			System.out.println("�ݾ� ���� !");
		
		
		
		//����� ver
		//Scanner scan = new Scanner(System.in);
		System.out.print("�ο�ʼ�:");
		int su = sc.nextInt();
		//��ǰ��� ���� (Ex10)�� ������ �迭
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1.�Ƹ޸�ī��(2500)");
			System.out.println("2.ī���ī(3000)");
			System.out.println("3.ī���(3500)");
			System.out.println("4.�ڸ��ֽ�(3000)");
			System.out.println("�����ϼ�>>>");
			int menu = sc.nextInt();
			Ex10 product = new Ex10();
			if(menu ==1) {
				product.setMenu("�Ƹ޸�ī��");
				product.setPrice(2500);
			}else if(menu==2) {
				product.setMenu("ī���ī");
				product.setPrice(3000);
			}else if(menu==3) {
				product.setMenu("ī���");
				product.setPrice(3500);
			}else if(menu==4) {
				product.setMenu("�ڸ��ֽ�");
				product.setPrice(3000);
			}
			offer[i] = product;
		}
		//��ü�ݾ�
		int sum2 = 0;
		for (int i = 0; i < offer.length; i++) {
			sum2 = sum2 + offer[i].getPrice();
		}
		System.out.println("�� �� : " + sum2);
		System.out.print("�Աݾ� : ");
		int input2 = sc.nextInt();
		System.out.println("�ܵ� : " + (input2-sum2));
	}

}
