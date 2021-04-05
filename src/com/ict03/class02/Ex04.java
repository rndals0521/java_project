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
			System.out.print("가위 바위 보 중 선택하세요 1)가위 2)바위 3)보 4) 종료");
			n = sc.nextInt();
			k = (int)(ran.nextDouble()*3)+1;
			
			switch(n) {
				case 1: 
					if(k==1) {
						System.out.println("무승부");
						count++;
						draw++; break;}
					else if(k==2) {
						System.out.println("패배");
						count++;
						lose++; break;}
					else if(k==3) {
						System.out.println("승리");
						count++;
						win++; break;}
				case 2: 
					if(k==1) {
						System.out.println("승리");
						count++;
						win++; break;}
					else if(k==2) {
						System.out.println("무승부");
						count++;
						draw++; break;}
					else if(k==3) {
						System.out.println("패배");
						count++;
						lose++; break;}
				case 3: 
					if(k==1) { 
						System.out.println("패배");
						count++;
						lose++; break;}
					else if(k==2) {
						System.out.println("승리");
						count++;
						win++; break;}
					else if(k==3) {
						System.out.println("무승부");
						count++;
						draw++; break;}
			}
			if(n==4) {
				System.out.println("판수="+ count + " / 승률="+(double)(win*100)/count+"%");
				break;
			}
			
		}
	}
}

