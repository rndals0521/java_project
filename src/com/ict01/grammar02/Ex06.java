package com.ict01.grammar02;
class Ex06{
	public static void main(String[] args) {
	
		//��� ������; +,-,*,/,%
		//�����ڷ����� ū�ڷ����� �����ϸ� ū�ڷ������� ����
		//int+int = int  , long + long = long , float + float = float
		//����) byte + byte = int ,  short + short = int , byte + short = int
		// int + long = long , float + double = double
		// int + double = double

		//������ ����
		int k = 21755; // => 21750
		int s1 = k / 10;
		int s2 = s1*10;
		int s3 = (k/10) *10;
		int s4 = (21755/10) *10;
		System.out.println(s4);

		//�Ҽ��� ù°�ڸ����� ���ϱ�
		double k2 = 24.6843;
		int k3 = (int)(k2*10);
		double k4 = k3 /10.0;
		
		double s7 = (int)(k2*10) / 10.0;
		System.out.println(s7);


		// '/' ����� int�̸� ��
		int su1 = 7;
		int su2 = 3;
		int res1 = 7/3;
		int res2 = 7%3;

		// Ȧ���� ����� 2�γ��� ��������1�� ������ Ȧ��
		// ����� 2�� ���� �������� 0�������� ¦��
		// ���������� ����� k�� ���� �������� 0�������� k�� ���

	}
}		