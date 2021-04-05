package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		// 배열 정렬하 기
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		
		int temp = 0;
		for (int i = 0; i < su.length-1; i++) {
			//오름차순
 			for (int j = i+1; j < su.length; j++) {
				if(su[i] > su[j]) {  // 부등호 바꾸면 내림차순
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
				
			}
		}
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println("================");
		
		int[] su2 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su2); //sort 메소드는 해당 배열을 오름차순 하는 기능
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		
		System.out.println("================");
		
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8};
		//Arrays.sort(배열, Collections.reversOrder())
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
		
		//일부만 정렬하기
		int[] su4 = {3,4,9,5,6,1,7,2,10,8};
		
	}

}