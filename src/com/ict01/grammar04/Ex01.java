package com.ict01.grammar04;
class Ex01{
	public static void main(String[] args) {
		//switch ~ case �� : if���� ���� �б⹮
		//if���� ���ǽ��� boolean��, �񱳿���, ������
		//switch���� byte,short,int,char,String�� �� ���
		//������ ������ �⺻�����δ� if���� ����Ѵ�.
		//switch -> if������ 100% ��ȯ�� �����ϴ�.
		// ���� : switch(���ڰ� (char,int,String)) {
		//         case ���ǰ�1 : ���ڰ��� ���ǰ�1�� ���� �� �����ҹ��� ; break;
		//         case ���ǰ�2 : ���ڰ��� ���ǰ�2�� ���� �� ''
		//         case ���ǰ�3 : ���ڰ��� ���ǰ�3�� ���� �� ''
		//         default : ���ǰ�1,2,3 ��� �䱸�ϴ� ���� �ƴҶ�, �� ������
		//         }

		// ** ���ǻ��� : break���� ������ ���� break�� ���������� ��� ���๮�� �����Ѵ�.
		// break���� �ش� switch���� ���������� ������ �Ѵ�.

		//char k1�� A�̸� ������ī,B�̸� �����, C�̸� ĳ���� ������ �ѱ�
		char k1 = 'C';
		String str = "";
		switch(k1){
			case 'A' : str = "������ī"; break;
			case 'B' : str = "�����"; break;
			case 'C' : str = "ĳ����"; break;
			default : str = "�ѱ�" ; break;
			
		}
		System.out.println(str);
		
		//char k1�� A,a�̸� ������ī,B,b�̸� �����, C,c�̸� ĳ���� ������ �ѱ�
		switch(k1){
			case 'A' : 
			case 'a' : str = "������ī"; break;
			case 'B' : 
			case 'b' : str = "������ī"; break;
			case 'C' : 
			case 'c' : str = "������ī"; break;
			default : str = "�ѱ�" ; 
		}
		System.out.println(str);

		// int k2 �� 1�Ǵ� 3�̸� ����, 2�Ǵ� 4�̸� ����
		int k2 = 3;
		String str2 ="";
		switch(k2){
			case 1 :
			case 3 : str2 = "����"; break;
			case 2 :
			case 4 : str2 = "����"; break;
		}
		System.out.println(str2);

		// String k3�� �ѱ��̸� ����,�߱��̸� ����¡, �Ϻ��̸� ����
		String k3 = "�ѱ�";
		String str3 = "";
		switch(k3) {
			case "�ѱ�" : str3 = "����"; break;
			case "�߱�" : str3 = "����¡"; break;
			case "�Ϻ�" : str3 = "����"; break;
			default : str3 = "";
		}
		System.out.println(str3);
	}
}