package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 catch문 : try문의 예외 발생이 여러가지의 예외가 발생할 경우 사용
		// 주의 사항 : Exception를 사용할때는 반드시 아래쪽 catch문에서 사용한다.
		
		Scanner sc = new Scanner(System.in);
		/*
		try {
			int var = 27;
			System.out.println("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var/su));
			
			System.out.println("수고하셧습니다.");
			
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 숫자를 나눌 수 없다.");
		}
		*/
		try {
			int var = 27;
			System.out.println("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var/su));
			
			System.out.println("수고하셧습니다.");
		} catch (Exception e) {
			System.out.println("제대로 입력하세요 : " + e);
		}
		System.out.println("수고");
	}
}
