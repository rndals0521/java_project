package com.ict02.array;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] rank = {1,1,1,1,1};
		
		int sum[] = new int[5];
		double avg[] = new double[5];
		String[] hak = new String[5];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("�̸��Է�:");
			name[i]=sc.next();
			System.out.print("�������� �Է�:");
			kor[i]=sc.nextInt();
			System.out.print("�������� �Է�:");
			eng[i]=sc.nextInt();
			System.out.print("�������� �Է�:");
			math[i]=sc.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if(avg[i]>90)
				hak[i] = "A";
			else if(avg[i]>80)
				hak[i] = "B";
			else if(avg[i]>70)
				hak[i] = "C";
			else
				hak[i] = "F";
		}
		for (int i = 0; i < hak.length; i++) {
			for (int j = 0; j < hak.length; j++) {
				if(sum[i]<sum[j])
					rank[i]++;
			}
		}
		System.out.println("�̸�\t����\t���\t����\t����");
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]+"\t");
		}
		
		
	}
}
