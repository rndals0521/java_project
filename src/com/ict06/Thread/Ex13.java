package com.ict06.Thread;

public class Ex13 implements Runnable{

	// �Ӱ迵�� : ��Ƽ�����忡�� �������� ���Ǵ� ����
	//            ���� ���� ���� �����尡 ���İ��� �ٸ� �����忡��
	//            ������� ���ұ�� ������ �߻��Ѵ�.
	//            �̸� �ذ��ϱ� ���� ����� ����ȭ ó���̴�.
	// ����ȭó�� : �Ӱ迵���� synchronized ���� ����ϸ� �ȴ�.
	//              �׷��� ���� �������� �����尡 ������ ���� �Ӱ迵����
	//              �ٸ� �����尡 �����ؼ� ������� ������ �� ����.
	

	@Override
	public synchronized void run() {
		int x=0;
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
		}
	}
}
