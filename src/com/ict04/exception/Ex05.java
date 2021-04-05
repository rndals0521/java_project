package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) //throws NumberFormatException 메인에서도 넘길수 있으나 되도록 그러지는 말자
	{
		// throws (예외 양도, 예외전가)
		// -예외가 발생하면 에외처리를 하지 않고, 자신을 호출한 곳으로 예외 객체를 전달하는 것
		// -나중에라도 예외처리(try~catch)를 하는 것이 좋다.
		
		
		Ex05 test = new Ex05();
		Scanner sc = new Scanner(System.in);
		try {			
			System.out.println("정수입력 : ");
			String message = sc.next();
			test.setData(message);
		} catch (Exception e) {
			System.out.println("제대로 입력해");
		}
	}

	public void setData(String msg) throws NumberFormatException {
		//msg에 글자의 길이가 한개 이상이면 실행
		if(msg.length()>=1) {
			String str = msg.substring(0,1); // 첫글자만 추출해라
			prnData(str);
		}
	}
	
	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
