package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04_1 {
	// �߱����� �����
	// ������� : �ƿ� 3�� / �ݺ� 9��
	// ���ڴ� ������ ��ġ�� Ʋ���� ��, ������ġ���� ������ ��Ʈ����ũ, ������ġ ���� Ʋ���� �ƿ�
	// ���� 3�ڸ�[1]�� ���ڸ� ���Ƿ� ���� ��, ���ο��� 3�ڸ��� ���ڸ� �ҷ��� ����� Ȯ���Ѵ�.
	// �׸��� �� ����� ���� ��밡 ���� ���ڸ� ������ �� ������.
	// ���� ���ڴ� 0���� 9���� ���� �ٸ� �����̴�.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int strike = 0;
		int ball = 0;
		int out = 0;

		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = (int)(ran.nextDouble() * 9);
			for (int j = 0; j < i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
			System.out.print(num[i]);
		}

		System.out.println("�߱����� ����!! ��ȣ�� �����Ǿ����ϴ�.����� ���ڸ� ���߼���");
		String[] arrInput = new String[3];
		int[] input = new int[3];
		int n = 0;
		while (true) {
			strike = 0;
			ball = 0;
			
			System.out.print("�����Է� : ");
			String inputS = sc.next();
			arrInput = inputS.split("");
			for (int i = 0; i < arrInput.length; i++) {
				input[i] = Integer.parseInt(arrInput[i]);
			}
			
			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < input.length; j++) {
					if(num[i]==input[j] && i==j) {
						strike++;
					}else if(num[i]==input[j] && i!=j){
						ball++;
					}
					
				}
				
			}
			if(strike==0 && ball==0) {
				System.out.println("�ƿ�!!");
				out++;
			}else if(strike==3){
				System.out.println("����!!");
				break;
			}else {
				System.out.println(strike + "��Ʈ����ũ! / " + ball + "��  " );
			}
			if(n>10) {
				System.out.println("�����ȸ �ʰ� �й� !");
				break;
			}else if(out>=3) {
				System.out.println(" �����ƿ� �й�! ");
				break;
			}
			n++;
		}
		
	}

}
