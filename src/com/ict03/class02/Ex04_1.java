package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04_1 {
	// 야구게임 만들기
	// 종료시점 : 아웃 3번 / 반복 9번
	// 숫자는 맞지만 위치가 틀리면 볼, 숫자위치전부 맞으면 스트라이크, 숫자위치 전부 틀리면 아웃
	// 각각 3자리[1]의 숫자를 임의로 정한 뒤, 서로에게 3자리의 숫자를 불러서 결과를 확인한다.
	// 그리고 그 결과를 토대로 상대가 적은 숫자를 예상한 뒤 맞힌다.
	// 사용된 숫자는 0에서 9까지 서로 다른 숫자이다.
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

		System.out.println("야구게임 시작!! 번호가 지정되었습니다.상대의 숫자를 맞추세요");
		String[] arrInput = new String[3];
		int[] input = new int[3];
		int n = 0;
		while (true) {
			strike = 0;
			ball = 0;
			
			System.out.print("숫자입력 : ");
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
				System.out.println("아웃!!");
				out++;
			}else if(strike==3){
				System.out.println("정답!!");
				break;
			}else {
				System.out.println(strike + "스트라이크! / " + ball + "볼  " );
			}
			if(n>10) {
				System.out.println("정답기회 초과 패배 !");
				break;
			}else if(out>=3) {
				System.out.println(" 삼진아웃 패배! ");
				break;
			}
			n++;
		}
		
	}

}
