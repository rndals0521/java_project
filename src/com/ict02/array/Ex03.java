package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		// �迭 ������ ��
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		
		int temp = 0;
		for (int i = 0; i < su.length-1; i++) {
			//��������
 			for (int j = i+1; j < su.length; j++) {
				if(su[i] > su[j]) {  // �ε�ȣ �ٲٸ� ��������
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
		Arrays.sort(su2); //sort �޼ҵ�� �ش� �迭�� �������� �ϴ� ���
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		
		System.out.println("================");
		
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8};
		//Arrays.sort(�迭, Collections.reversOrder())
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
		
		//�Ϻθ� �����ϱ�
		int[] su4 = {3,4,9,5,6,1,7,2,10,8};
		
	}

}