package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
		// 2시간 40분 23초를 초단위로 변경해라
		int hour = 2;
		int minute = 40;
		int second = 23;
		int Allsecond = hour*3600 + minute*60 + second;
		System.out.println(Allsecond);

		/// 9630 초는 몇시간 몇분 몇초인가?
		Allsecond = 9630;
		hour = Allsecond/3600;
		minute = (Allsecond%3600)/60;
		second = ((Allsecond%3600)%60);
		System.out.println(hour+"시간" + minute + "분" + second +"초");

		//
		int time = 9630;
		int h1=0,m1=0,s=0,res=0;
		h1 = time /(60*60);
		res = time %(60*60);
		
		m1 = res/60;
		s = res % 60;
		System.out.println(time + "초는" + h1 + ":" + m1 + ":" + s);
	}
}