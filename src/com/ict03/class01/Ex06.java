package com.ict03.class01;

public class Ex06 {
	
	private String name = "ȫ�浿";
	private int age = 24;
	private double height = 180.3;
	private char rank = 'A';
	
	// private ������ �����ϱ� ���ؼ��� �޼ҵ带 ����ؾ� �Ѵ�.
	// getter()
	public String k1() {
		return name;
	}
	
	public int k2() {
		return age;
	}
	
	public double k3() {
		return height;
	}
	
	public char k4() {
		return rank;
	}
	
	//������ �����ؼ� �ش� ������ �����͸� �����Ҷ� ���
	//setter() 
	
	public void m1(String t1) {
		name = t1;
	}
	
	public void m2(int t2) {
		age = t2;
	}
	public void m3(double t3) {
		height = t3;
	}
	public void m4(char t4) {
		rank = t4;
	}
}
