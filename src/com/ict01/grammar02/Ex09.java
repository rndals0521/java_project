package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
		// 2�ð� 40�� 23�ʸ� �ʴ����� �����ض�
		int hour = 2;
		int minute = 40;
		int second = 23;
		int Allsecond = hour*3600 + minute*60 + second;
		System.out.println(Allsecond);

		/// 9630 �ʴ� ��ð� ��� �����ΰ�?
		Allsecond = 9630;
		hour = Allsecond/3600;
		minute = (Allsecond%3600)/60;
		second = ((Allsecond%3600)%60);
		System.out.println(hour+"�ð�" + minute + "��" + second +"��");

		//
		int time = 9630;
		int h1=0,m1=0,s=0,res=0;
		h1 = time /(60*60);
		res = time %(60*60);
		
		m1 = res/60;
		s = res % 60;
		System.out.println(time + "�ʴ�" + h1 + ":" + m1 + ":" + s);
	}
}