package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// c:\\study\\util\\test100.txt 파일안에
		// 이름 : 000
		// 나이 : 000
		// 전화번호 : 000-0000-0000 를
		// 작성하는 코딩을 하시오.
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"tet100.txt";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String str = "이름 : 남궁민\n나이 : 26\n전화번호 : 010-4189-9549";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.flush();
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
