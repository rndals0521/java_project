package com.ict08.Network;

import java.util.Random;
import java.util.Scanner;

public class Ex00 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("번호:");
			int no = sc.nextInt();
			System.out.println("국어 : " );
			int kor = sc.nextInt();
			System.out.println("영어 : " );
			int eng = sc.nextInt();
			System.out.println("수학 : " );
			int math = sc.nextInt();
			int sum = kor + eng + math;
			int avg = sum/3;
			int hak = 0;
			if(avg>90) {
				hak='A';
			}else if(avg>80) {
				hak='B';
			}else if(avg>70) {
				hak='C';
			}else {
				hak='F';
			}
			
			int rank = 1;
			int[] person = new int[5];
			person[0] = no;
			person[1] = sum;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			arr[i] = person;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][0] == arr[j][0]) continue;
				if(arr[i][1] > arr[j][1]) {
					arr[j][4] += 1;
				}
			}
		}
		
		int[] temp = new int[5];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][1] < arr[j][1]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0]+"\t");
			System.out.print(arr[i][1]+"\t");
			System.out.print(arr[i][2]+"\t");
			System.out.print((char)arr[i][3]+"\t");
			System.out.println(arr[i][4]+"\t");
		}
		
	}
}
