package com.ict03.class04;

public class Ex07_Dog extends Ex06_Animal{

	
	@Override
	public void sound() {
		System.out.println("므어므엉");
	}
	
	@Override
	public void eat(String food) {
		System.out.println("사료");
	}
	
	@Override
	public String play() {
		return "앞 마당에서 놀기";
	}
}
