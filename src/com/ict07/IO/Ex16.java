package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// BufferdWrite : �ӵ� ����� ���� ���. �ٹٲٱ� �޼ҵ尡 �����Ѵ�.
		
		
		String pathname = "c:" + File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// �ѱ��� ����
			bw.write(97);
			bw.write(65);
			
			// int �̹Ƿ� char�� ��ó�� �� �ִ�.
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write("��"); //FileOutputStream�� �ȵ����� FileWriter�� ����
			bw.write("��"); //FileOutputStream�� �ȵ����� FileWriter�� ����
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'��','��','��','��',13};
			bw.write(c);
			
			bw.write("korea�� ���ѹα�");
			bw.newLine(); // �� ���� �޼ҵ�
			bw.write("1������");
			bw.newLine();
			bw.write("�ڹټ���");
			bw.newLine();           // ���ڴ� �̷��� ���°� ������..
			
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				
			} catch (Exception e2) {
			}
		}
		
		
		// FileInputStream (����Ʈ) : 1byte ó��, write(int b), write(byte[] b) => ����(ASCII�ڵ�)  
		// FileReader (����)        :
	}
}
