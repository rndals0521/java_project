package com.ict06.Thread;

public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		
		new Thread(t1).start();
		new Thread(t1).start();
		
		//��ü�� t1,t2 �ΰ� ���� �ϸ� ���� �Ӱ迵���� �ƴϱ⶧���� Ʋ�� �ڵ�
		
	}
}
