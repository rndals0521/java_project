package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ����ȭ : ObjectOutputstream : writeObject() 
public class Ex23_Output {
	public static void main(String[] args) {
		// ��ü ����ȭ : Ư��Ŭ����(VO)�� ��ü�� ����� Ư����ġ�� .ser ���Ϸ� ���� �����Ѵ�.
		//               ��ü���� ������ �ִ� ������ ����ȭ �Ǿ� �ִ�.(����� ������ ����� �� �� ����.)
		
		String pathname ="C:"+File.separator + "study" + File.separator + "util" + File.separator
				 + "ict07.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// ��ü����ȭ�� �ϱ� ���� ��ü ����.
			Ex23_VO VO = new Ex23_VO("�Ѹ�",28,45.2,true);
			
			// ��ü ����ȭ
			oos.writeObject(VO);
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
