package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	// List �������̽��� ������ Ŭ������ : Stack, ArrayList,Vector;
	// Stack(����) : LIFO ( Last In First Out) : �������� ���� �����Ͱ� �� ó�� ������.
	// �ֿ�޼ҵ�
	// add,push,addElement => �߰�
	// add(index,E) => ����
	// pop : ������ �����ϴ� ��ü�� ��ȯ�ϰ� �����Ѵ�.
	// peek : ������ �����ϴ� ��ü�� ��ȯ�ϰ� �������� �ʴ´�.(���ѷ�������)
	// search : �˻�(������,1����)
	// indexOf : �˻�(����, 0����) => �迭���
	// elementAt(index) : ��ġ���� �޾Ƽ� �ش� ��ü ����
	// get(index) : ��ġ���� �޾Ƽ� �ش� ��ü ����
	// firstElement : �� ó�� ��� ����
	// lastElement : �� ������ ��� ����
	// setElement(Element, index) : ġȯ
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("�Ѹ�");
		stack.addElement("������");
		stack.push("������");
		System.out.println(stack);

		stack.add(1,"�浿��"); //����
		stack.add(0,"��ġ");   //����
		stack.add(1,"�Ѳ�");   //���� (�ߺ��ƴ�)
		stack.add(1,"�Ѹ�");   //�ߺ� ��밡��
		System.out.println(stack);
		System.out.println("===============================");
		// ������ ��ü���� pop(����o), peek(����x = for������ ���� ����);
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
			
		// contains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("�Ѹ�")) {
			//System.out.println("������");
			// �ش� ��ü�� ��ġ��
			System.out.println(stack.indexOf("�Ѹ�")+"��° ��ġ");
			System.out.println(stack.search("�Ѹ�")+"��° ��ġ");  // �ٸ� ������ ã�� ������ �ٸ���.
			// �ش� ��ġ�� ��ü ������
			System.out.println(stack.get(1));
			System.out.println(stack.get(stack.indexOf("�Ѹ�")));
			System.out.println(stack.elementAt(stack.indexOf("�Ѹ�")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		}else {
			System.out.println("������������");
		}
		
		
		// size , setElementAt
		System.out.println(stack.size()+"��Ұ� �����մϴ�.");
		// index�� 3��
		//stack.set(3,"����");
		stack.setElementAt("����",3);
		System.out.println(stack);
		
		// �ϳ��� ������ (������ for,iterator (������ �״�� ����) , pop(������ ����))
		
		for (String k : stack) {
			System.out.print(k + " ");
		}
		System.out.println(stack.size() + "��Ұ� ������");
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.print(string + " ");
		}
		System.out.println(stack.size() + "��Ұ� ������");
		
		/*
		for(int i = 0;i<stack.size();i++) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println(stack.size() + "��Ұ� ������");
		*/
		
		while (!stack.isEmpty()) {
			
			String k = stack.pop();
			System.out.println(k + "������, ũ��� " + stack.size());
		}
		
		
		
		
		
	}
}
