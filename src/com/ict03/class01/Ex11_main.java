package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
		//Ex11 test1 = new Ex11(); -> Ex11 기본생성자가 아닌 다른생성자가 있기 때문에 오류
		//다른생성자로 객체 생성을 해야한다.
		Ex11 test1 = new Ex11("홍길동",34);
		
		System.out.println("이름:" + test1.getName() + " 나이:"+test1.getAge()+" 성별:"+test1.isGender());
		
		
		//Ex11 test2 = new Ex11(); -> 마찬가지
		Ex11 test2 = new Ex11(89,"김버핏");
		System.out.println("이름:" + test2.getName() + " 나이:"+test2.getAge()+" 성별:"+test2.isGender());
		
		//setter를 이용해서 멤버필드의 값을 변경할 수 있다.
		test2.setName("일지매");
		System.out.println("이름:" + test2.getName() + " 나이:"+test2.getAge()+" 성별:"+test2.isGender());
		
	}
}
