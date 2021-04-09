package com.ict06.Thread;

import java.util.*;
public class Ex17_Car {
	
	// �÷��� : �ڵ����� �����ϴ� ����
	private List<String> carList=null;
	
	// ������ : �ش� Ŭ������ ��ü�� �����Ǹ� calList�� �����Ѵ�.
	public Ex17_Car() {
		carList = new ArrayList<String>();
		
	}
	
	//�������� �ڵ��� ����
	public String getCar() {
		String carName = null;
		switch((int)(Math.random() *3)) {
			case 0 : carName = "SM5"; break;
			case 1 : carName = "�ű׳ʽ�"; break;
			case 2 : carName = "ī����"; break;
		}
		return carName;
	}
	
	public synchronized String pop() {
		String carName = null;
		if(carList.size() ==0) {
			try {
				System.out.println("���� ����� �����Ҷ����� " + "��ٸ�����");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		carName = (String)carList.remove(carList.size() -1);
		System.out.println("�մ��� ���� �簬���ϴ�.." + "�մ��� ������ ���̸���=>\" " + carName+"\"");
		return carName;
	}
	
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("���� ����������ϴ�." + "���̸��� \" " + car +"\"");
		if(carList.size() == 5) {
			// ����� 0�϶� ����Ų �����带 �غ���·� �����Ų��.
			this.notify();
		}
	}

}