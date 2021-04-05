package com.ict01.grammar03;
class Ex11{
	public static void main(String[] args){
		//다중 if문 :  조건식이 거짓일때 다시 조건식을 사용한다.
		
		//int k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C,나머지F
		int k1 = 99;
		char c = ' ';
		if (k1 >=90){
			c = 'A';
		}
		else if( k1 >= 80){
			c = 'B';
		}
		else if( k1 >= 70){
			c = 'C';
		}
		else{
			c = 'F';
		}
	
		System.out.println(c);		

		//Char k2 가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = 'A';
		String str = "";
		if (k2>='A' && k2<='Z') 
			str = "대문자";
		else if(k2>='a'&&k2<='z')
			str = "소문자";
		else if(k2>=0 && k2<=9)
			str = "숫자";
		else
			str = "기타문자";
		System.out.println(str);
		
		//Char k3 가 A,a이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지 한국
		char k3 = 'k';
		String str2 = "";
		if(k3=='A' || k3=='a')
			str = "아프리카";
		else if(k3=='B' || k3=='b')
			str = "브라질";
		else if(k3=='A' || k3=='a')
			str = "아프리카";
		else if(k3=='C' || k3=='c')
			str = "캐나다";
		else
			str = "한국";
		System.out.println(str);

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500
		// 친구와 2잔을 10000내고 먹었다.
		// 잔돈은 얼마인가? (단, 부가세 10%를 포함시키자)

		int menu = 3; 
		int pay = 10000;
		int money = 0;
		
		if(menu ==1) {
			money = pay- (int)((3500*2)*1.1);	
		}else if(menu ==2){
			money = pay - (int)((4000*2)*1.1);
		}else if(menu ==3){
			money = pay - (int)((3000*2)*1.1);
		}else if(menu ==4){
			money = pay - (int)((3500*2)*1.1);
		}
		
		System.out.println(money);

		switch(menu) {
		case 1:
			money = pay- (int)((3500*2)*1.1);
			break;
		case 2:
			money = pay - (int)((4000*2)*1.1);
			break;
		case 3:
			money = pay - (int)((3000*2)*1.1);
			break;
		case 4:
			money = pay - (int)((3500*2)*1.1);
			break;
		}	
	}		
}
