package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ����ȭ : ObjectOutputstream : writeObject() 
public class Ex24_Output {
	public static void main(String[] args) {
		// ��ü ����ȭ : Ư��Ŭ����(VO)�� ��ü�� ����� Ư����ġ�� .ser ���Ϸ� ���� �����Ѵ�.
		//               ��ü���� ������ �ִ� ������ ����ȭ �Ǿ� �ִ�.(����� ������ ����� �� �� ����.)
		
		String pathname ="C:"+File.separator + "study" + File.separator + "util" + File.separator
				 + "ict08.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// ��ü����ȭ�� �ϱ� ���� ��ü ����.
			Ex24_VO VO1 = new Ex24_VO("�Ѹ�",28,45.2,true);
			Ex24_VO VO2 = new Ex24_VO("��浿",51,81.5,true);
			Ex24_VO VO3 = new Ex24_VO("������",21,42.1,false);
			Ex24_VO VO4 = new Ex24_VO("�����",5,21.5,true);
			Ex24_VO VO5 = new Ex24_VO("��ġ",18,45.2,false);
			
			// ��ü�� �迭�̳� �÷��ǿ� ���� �� �ִ�.
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>();
			list.add(VO1);
			list.add(VO2);
			list.add(VO3);
			list.add(VO4);
			list.add(VO5);
			
			// ��ü ����ȭ
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
