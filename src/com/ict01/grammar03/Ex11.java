package com.ict01.grammar03;
class Ex11{
	public static void main(String[] args){
		//���� if�� :  ���ǽ��� �����϶� �ٽ� ���ǽ��� ����Ѵ�.
		
		//int k1�� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C,������F
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

		//Char k2 �� �빮������, �ҹ�������, ��������, ��Ÿ�������� �Ǻ�
		char k2 = 'A';
		String str = "";
		if (k2>='A' && k2<='Z') 
			str = "�빮��";
		else if(k2>='a'&&k2<='z')
			str = "�ҹ���";
		else if(k2>=0 && k2<=9)
			str = "����";
		else
			str = "��Ÿ����";
		System.out.println(str);
		
		//Char k3 �� A,a�̸� ������ī B,b�̸� ����� C,c�̸� ĳ���� ������ �ѱ�
		char k3 = 'k';
		String str2 = "";
		if(k3=='A' || k3=='a')
			str = "������ī";
		else if(k3=='B' || k3=='b')
			str = "�����";
		else if(k3=='A' || k3=='a')
			str = "������ī";
		else if(k3=='C' || k3=='c')
			str = "ĳ����";
		else
			str = "�ѱ�";
		System.out.println(str);

		// menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000, 4�̸� �����꽺 3500
		// ģ���� 2���� 10000���� �Ծ���.
		// �ܵ��� ���ΰ�? (��, �ΰ��� 10%�� ���Խ�Ű��)

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
