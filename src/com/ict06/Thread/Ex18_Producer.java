package com.ict06.Thread;

public class Ex18_Producer implements Runnable {

	//Ŭ������ �ڷ������� ��� (�����ڷ���)
	private Ex17_Car car;
	
	// �����ڿ��� ���� ���ڴ� ������ ���������� ������
	public Ex18_Producer(Ex17_Car car) {
		// ���������� ���������� �̸��� ���� �� �������� �տ� this�� ������.
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
