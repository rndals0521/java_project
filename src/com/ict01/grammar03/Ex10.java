package com.ict01.grammar03;
class Ex10{
	public static void main(String[] args) {
		//if~else~ : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ�.
		//����  if(���ǽ�){
		//	���ǽ��� ���϶� ������ ����;
		//        } else {
		//	���ǽ��� �����϶� ������ ����;
		//        }
		// ��, ������ ������ �ѹ����̸� ���� ����.

		//int k1 �� 60�̻��̸� �հ� �ƴϸ� ���հ�
		int k1 = 70;
		if (k1>=60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}


		//int k2�� Ȧ������ ¦������ �Ǻ�����

		int k2 = 7;
		if (k2%2==0){
			System.out.println("�հ�");
		}else{
			System.out.println("¦��");
		}			

		//char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�����
		
		char k3 ='a';
		if (k3>='A'&&k3<='Z'){
			System.out.println("�빮��");
		}else{
			System.out.println("�ҹ���");
		}
		
		//k4�� 1�Ǵ� 3�̸� ���� �ƴϸ� ����

		int k4 = 1;
		if (k4==1||k4==3){
			System.out.println("����");
		}else{
			System.out.println("����");
		}

		//�ٹ��ð��� 8�ð������� �ð��� 8720�̰� 8�ð��� �ʰ��� �ð���ŭ�� 1.5���̴�.
		//���� �ٹ��ð��� 10�ð��̴�. �󸶸� �޾ƾ��ϴ°�?

		int time = 10;
		int price = 8720;
		int pay=0;
		if(time>8){
			pay=(price*8)+(int)((price*1.5)*(time-8));
		}else{
			pay = price*time;
		}
		System.out.println(pay);


	}
}