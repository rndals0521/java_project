package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 객체 역직렬화 : ObjectInputStream : readObject()

public class Ex24_Input {
	public static void main(String[] args) {
		// 객체 역직렬화 : 직렬화된 파일이나 정보를 원래 내용으로 복원하는 역할을 함
		
		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator
				+ "ict08.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
				
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역질렬화; 원래 객체로 되돌아간다.
			//ois.readObject();
			//Ex23_VO vo = new Ex23_VO();
			ArrayList<Ex24_VO> list = (ArrayList<Ex24_VO>)ois.readObject();
			
			// for문이나 Iterator를 써서 풀어낸다.
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex24_VO k : list) {
				System.out.print(k.getName() +"\t");
				System.out.print(k.getAge() +"\t");
				System.out.print(k.getWeight() +"\t");
				boolean b = k.isGender();
				if(b) {
					System.out.println("男성");
				}else {
					System.out.println("女성");
				}
			}
			 
			
		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
