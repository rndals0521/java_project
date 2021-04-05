package com.ict03.class04;

public class Ex07_Cat extends Ex06_Animal{

	@Override
	public void sound() {
		System.out.println("니양 니양");
		
	}

	@Override
	public void eat(String food) {
		System.out.println("생선");
		
	}

	@Override
	public String play() {
		return "캣 타워에서 놀기";
	}

}
