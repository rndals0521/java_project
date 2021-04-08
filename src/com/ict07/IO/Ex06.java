package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		// �ӵ������ ���ؼ� BufferedOuputStream�� ����Ѵ�.
		// ȥ�ڼ��� ����� �� ���� �ݵ�� OutputStream�� �޾Ƽ� ����Ѵ�.
		// ������ : BufferedOutputStream(OutputStream out)
		
		
		
		// Ư����ġ�� ���ϱ��� ����
		String pathname =  "C:" + File.separator+"study"+File.separator+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// ���������� ������ ������ϰ�, ������ ����
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			
			// ���������� ������ �̾���ϰ�, ������ ����
			//fos = new FileOutputStream(file,true);
			
			// �ѱ��� ����
			bos.write(65);
			bos.write(97);
			bos.write('D');
			bos.write('O');
			bos.write('D');
			
			
			// �ڹٿ��� �ٺ����� 13 (Carriage return = CR = \r)�̴�.
			// �ٸ� ����߿��� (\r\n(Line feed : 10)�� ���� ����ϴ� ��쵵 �ִ�.  
			// �ٺ���			
			bos.write(13);
			
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'h','e','y','s',13,'g','u','y','s',13};
			bos.write(b);
			
			// String �� �̿�����(���� �̿� ���ڵ� ����)
			String str = "Hello\r�ȳ�\r123\r����";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
