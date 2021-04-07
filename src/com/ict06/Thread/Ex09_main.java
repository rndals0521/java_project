package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07,08,09 �� Runnable�� ��ӹ޾ұ� ������
		// start() �� ����.
		//t1.start();
		
		
		// ���� run() �޼ҵ带 ���� Ŭ���� �� Ÿ���� �����ؾ� �Ѵ�.
		//Thread thread = new Thread(); 
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// �ȵ���̵忡�� ���� ����ϴ� ��� (�͸� ���� Ŭ����)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName()+": warnningwarnning");
				}
			}
		}).start();
		
		// ���� ���̴°� Runnable �ڹٻ���� ���߻���� �ƴ϶� Thread�� ��ӹ�����
		// �ٸ��� ��ӹޱⰡ ���
	}
}