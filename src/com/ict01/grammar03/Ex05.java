package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args) {
		//int k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�
		int k1 = 60;
		String result1 = k1>=60 ? "�հ�" : "���հ�";
		System.out.println("��� : " + result1);
		
		//int k2�� Ȧ������ ¦������ �Ǻ�����
		int k2 = 3;
		String result2 = k2%2==0 ? "¦��" : "Ȧ��";
		System.out.println("��� : " +result2);

		//char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'd';
		String result3 = k3>='A' && k3<='Z' ? "�빮��" : "�빮�ھƴ�";
		System.out.println("��� : " + result3);

		//�ٹ��ð��� 8�ð������� �ð��� 8720�̰� 8�ð��� �ʰ��� �ð���ŭ�� 1.5���̴�.
		//���� �ٹ��ð��� 10�ð��̴�. �󸶸� �޾ƾ��ϴ°�?
		int time = 10;
		int price = 8720;
		int result4 = time <= 8 ? (price*time) : (int)((price*8)+((price*1.5)*(time-8)));
		System.out.println("��� : " + result4 + " ��");
		
	}
}