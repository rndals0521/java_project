package com.ict03.class01;

public class Ex13_main {
	public static void main(String[] args) {
		Ex13 t1 = new Ex13();
		System.out.println(t1);
		System.out.print(t1.getName() + "/" + t1.getAge() + "/" + t1.getAddr());
		System.out.println();
		
		Ex13 t2 = new Ex13(4, "¸¶ÀÌÄÝ");
		System.out.print(t2.getName() + "/" + t2.getAge() + "/" + t2.getAddr());
		System.out.println();
	}

}
