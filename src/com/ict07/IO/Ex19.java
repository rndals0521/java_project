package com.ict07.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		//���� ��ҿ� ���ϸ��� �ް�
		//���̱� ��ҿ� ���ϸ��� �޾Ƽ� ���̱�����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �ּҸ� �Է��Ͻÿ�.");
		String pathname1 = sc.next();
		System.out.print("������ ����� �ּҸ� �Է��Ͻÿ�.");
		String pathname2 = sc.next();
		
		File Rfile = new File(pathname1);
		File Wfile = new File(pathname2);
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(Rfile);
			
			char[] c = new char[(int)Rfile.length()];
			fr.read(c);
			
			fw = new FileWriter(Wfile);
			fw.write(c);
			
			fw.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				
				fw.close();
				fr.close();
				
			} catch (Exception e2) {
			}
		}
		
	}
}
