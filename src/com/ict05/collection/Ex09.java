package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		// 나라정보를 받으면 해당 나라의 수도를 출력하는 프로글매
		
		// 1. 나라와 수도를 가지고 있는 데이터
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("한국", "서울");
		map.put("대한민국", "서울");
		map.put("KOREA","서울");
		map.put("korea", "서울");
		map.put("미국", "워싱턴");
		map.put("중국", "북경");
		map.put("일본", "동경");
		map.put("태국", "방콕");
		map.put("캐나다", "오타와");
		
		Set<String> sets = map.keySet();
		Scanner sc = new Scanner(System.in);
		
		esc:
		while(true) {
			System.out.print("나라: ");
			String msg = sc.next();
			if(sets.contains(msg)) {
				String result = map.get(msg);
				System.out.println(result);
			}else {
				System.out.println("존재하지 않는 나라");
			}
			while(true) {
				System.out.println("계속할까요? (y/n)");
				String str = sc.next();
				if(str.equalsIgnoreCase("y")) {
					continue esc;
				}else if(str.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("잘못입력하심 다시입력 ㄱ");
					continue;
				}
			}
			
		}
		System.out.println("수고하셨습니다.");
	}
}
