package com.ict05.collection;

import java.util.LinkedList;

public class Ex07 {
	public static void main(String[] args) {
		// Queue(ť) �������̽��� ������ Ŭ���� : LinkedList
		//           FIFO(First In First Out) : �������°� ��������
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		// �߰� , ���� : add, addFirst, addLast, offer , offerFirst, offerLast
		
		linkedlist.add("����ȣ");
		linkedlist.offer("�ڼ���");
		linkedlist.add("�����");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("�豤��");
		linkedlist.offerFirst("������");
		System.out.println(linkedlist);

		if(linkedlist.contains("�ڼ���")) {
			System.out.println(linkedlist.indexOf("�ڼ���") + "��° ��ġ");
			System.out.println(linkedlist.get(linkedlist.indexOf("�ڼ���")));
			System.out.println(linkedlist.getFirst());
			System.out.println(linkedlist.getLast());
		} else {
			System.out.println("����");
		}
		System.out.println(linkedlist.size()+"��Ұ� ������");
		
		//�豤���� �̴�ȣ�� �ٲ��
		if(linkedlist.contains("�豤��")) {
			linkedlist.set(linkedlist.indexOf("�豤��"), "�̴�ȣ");
			System.out.println(linkedlist);			
			
		}else {
			System.out.println("����");
		}
		
		// ���� : remove, removeFirst, removeLast
		linkedlist.removeFirst();
		System.out.println(linkedlist);
		
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		System.out.println(linkedlist.remove(1) + "�� ���� �Ǿ����ϴ�.");
		System.out.println(linkedlist);
		
		
	}
}
