package com.ict01.grammar02;
class Ex08{
	public static void main(String[] args) {
		// 아메리카노가 2500원이다. 친구와 둘이서 10000을 내고 주문했다.
		// 잔돈은 얼마인가? (부가세 10%가 추가된다.)
		int americano = 2500;
		double a = 10000;
		double price = a - (americano + (double)(americano*0.1));
		System.out.println(price);

		String coff = "아메리카노";
		int dan = 2500;
		int su =2 ;
		int input = 10000;
		int total = dan * su;
		int vat = (int)(total * 0.1);
		int output = input - (total +vat);
		System.out.println("잔돈: " + output);
	}
}