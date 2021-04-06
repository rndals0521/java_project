package com.ict05.collection;

import java.util.LinkedList;

public class Ex07 {
	public static void main(String[] args) {
		// Queue(큐) 인터페이스를 구현한 클래스 : LinkedList
		//           FIFO(First In First Out) : 먼저들어온게 먼저나감
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		// 추가 , 삽입 : add, addFirst, addLast, offer , offerFirst, offerLast
		
		linkedlist.add("박찬호");
		linkedlist.offer("박세리");
		linkedlist.add("김미현");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("김광현");
		linkedlist.offerFirst("박지성");
		System.out.println(linkedlist);

		if(linkedlist.contains("박세리")) {
			System.out.println(linkedlist.indexOf("박세리") + "번째 위치");
			System.out.println(linkedlist.get(linkedlist.indexOf("박세리")));
			System.out.println(linkedlist.getFirst());
			System.out.println(linkedlist.getLast());
		} else {
			System.out.println("없음");
		}
		System.out.println(linkedlist.size()+"요소가 존재함");
		
		//김광현을 이대호로 바꿔라
		if(linkedlist.contains("김광현")) {
			linkedlist.set(linkedlist.indexOf("김광현"), "이대호");
			System.out.println(linkedlist);			
			
		}else {
			System.out.println("없음");
		}
		
		// 삭제 : remove, removeFirst, removeLast
		linkedlist.removeFirst();
		System.out.println(linkedlist);
		
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		System.out.println(linkedlist.remove(1) + "님 삭제 되었습니다.");
		System.out.println(linkedlist);
		
		
	}
}
