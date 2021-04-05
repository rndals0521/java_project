package com.ict03.class01;

public class Ex07 {
	private String name ="둘리";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	
	// getter /setter 호출 => 메뉴 -Source-
	//get
	public String getName() {
		return name;
	}
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	//public void setName(String k){
	//	name = k;
	//} -> 됨
	//public void setName(String name){
	//	name = name;
	//} -> 안됨 구분이 안가잖아~
	// 지역변수이름과 전역변수의 이름이 같을 때, 전역변수에는 this.를 붙여준다.
	// 지역변수이름과 전역변수의 이름이 같을 때, 우선순위는 지역변수가 먼저다.
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public char getRank() {
		return rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	
	
	

}
