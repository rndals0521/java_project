package com.ict07.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		// ����Ʈ-���� ���� : ü�ι��
		// �Է� : InputStreamReader : InputSteam -> Reader
		//       InputStream -> InputStreamReader -> Reader -> BufferedReader
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ���� �Է� : ");
		String msg = sc.next();
		System.out.println("���� ���� : " + msg);
		*/
		
		System.out.println("���ϴ� ���� �Է� : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			System.out.println("���� ���� : " + msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
	}

}
