package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int count =0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		int n,k;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���� ���� �� �� �����ϼ��� 1)���� 2)���� 3)�� 4) ����");
			n = sc.nextInt();
			k = (int)(ran.nextDouble()*3)+1;
			
			switch(n) {
				case 1: 
					if(k==1) {
						System.out.println("���º�");
						count++;
						draw++; break;}
					else if(k==2) {
						System.out.println("�й�");
						count++;
						lose++; break;}
					else if(k==3) {
						System.out.println("�¸�");
						count++;
						win++; break;}
				case 2: 
					if(k==1) {
						System.out.println("�¸�");
						count++;
						win++; break;}
					else if(k==2) {
						System.out.println("���º�");
						count++;
						draw++; break;}
					else if(k==3) {
						System.out.println("�й�");
						count++;
						lose++; break;}
				case 3: 
					if(k==1) { 
						System.out.println("�й�");
						count++;
						lose++; break;}
					else if(k==2) {
						System.out.println("�¸�");
						count++;
						win++; break;}
					else if(k==3) {
						System.out.println("���º�");
						count++;
						draw++; break;}
			}
			if(n==4) {
				System.out.println("�Ǽ�="+ count + " / �·�="+(double)(win*100)/count+"%");
				break;
			}
			
		}
	}
}

