package com.ict01.grammar02;
class Ex06{
	public static void main(String[] args) {
	
		//산술 연산자; +,-,*,/,%
		//작은자료형과 큰자료형을 연산하면 큰자료형으로 변경
		//int+int = int  , long + long = long , float + float = float
		//예외) byte + byte = int ,  short + short = int , byte + short = int
		// int + long = long , float + double = double
		// int + double = double

		//원단위 절삭
		int k = 21755; // => 21750
		int s1 = k / 10;
		int s2 = s1*10;
		int s3 = (k/10) *10;
		int s4 = (21755/10) *10;
		System.out.println(s4);

		//소숫점 첫째자리까지 구하기
		double k2 = 24.6843;
		int k3 = (int)(k2*10);
		double k4 = k3 /10.0;
		
		double s7 = (int)(k2*10) / 10.0;
		System.out.println(s7);


		// '/' 결과를 int이면 몫
		int su1 = 7;
		int su2 = 3;
		int res1 = 7/3;
		int res2 = 7%3;

		// 홀수는 어떤수를 2로나눈 나머지가1과 같으면 홀수
		// 어떤수를 2로 나눈 나머지가 0과같으면 짝수
		// 같은원리로 어떤수를 k로 나눈 나머지가 0과같으면 k의 배수

	}
}		