package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19_1 {
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
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(Rfile);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!= null) {
				sb.append(msg+"\n");
			}

			
			fw = new FileWriter(Wfile);
			bw = new BufferedWriter(fw);
			//bw.write(sb.toString());
	
			String str = sb.toString();
			str = str.replace("���ѹα�", "��������");
			bw.write(str);
			
			bw.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
				
			} catch (Exception e2) {
			}
		}
		
	}
}
