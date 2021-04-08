package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 1. FileOutputStream : ������ ������� 1byte�� ������ ���⸦ �� �� �ִ� ��Ʈ��
		//   -������ : FileOutputStream(File file) , FileOutputStream(File file, boolean append)
		//             FileOutputStream(String name), FileOutputStream(String name, boolean append)
		//       File file, String name => Ư����ġ + �����̸�
		//       boolean append : false �Ǵ� ������ �ϸ� �����, true�� �ϸ� �̾��
		//   -�ֿ�޼ҵ�
		//    write(int b)    => �ѱ��� ���� ����(�����ڴ�ҹ��ڼ���,�Ϻ�Ư������)
		//    write(byte[] b) => ���� ���ڸ� byte[]�� �־ ���� ����
		//    flush()         => write �� �ݵ�� ��������.
		//    close()         => open �� ��Ʈ�� �ݱ�(��� �� �ݱ�), ���� finally�� ó��.
		
		// Ư����ġ�� ���ϱ��� ����
		String pathname =  "C:" + File.separator+"study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			// ���������� ������ ������ϰ�, ������ ����
			fos = new FileOutputStream(file);
			
			// ���������� ������ �̾���ϰ�, ������ ����
			//fos = new FileOutputStream(file,true);
			
			// �ѱ��� ����
			fos.write(65);
			fos.write(97);
			fos.write('B');
			fos.write('O');
			fos.write('B');
			
			
			// �ڹٿ��� �ٺ����� 13 (Carriage return = CR = \r)�̴�.
			// �ٸ� ����߿��� (\r\n(Line feed : 10)�� ���� ����ϴ� ��쵵 �ִ�.  
			// �ٺ���			
			fos.write(13);
			
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s',13};
			fos.write(b);
			
			// String �� �̿�����(���� �̿� ���ڵ� ����)
			String str = "Hello\r�ȳ�\r123\r����";
			byte[] b2 = str.getBytes();
			fos.write(b2);
			
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
