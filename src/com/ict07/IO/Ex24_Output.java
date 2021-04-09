package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 직렬화 : ObjectOutputstream : writeObject() 
public class Ex24_Output {
	public static void main(String[] args) {
		// 객체 직렬화 : 특정클래스(VO)를 객체로 만들어 특정위치에 .ser 파일로 만들어서 저장한다.
		//               객체들이 가지고 있는 내용이 직렬화 되어 있다.(사람은 정보를 제대로 볼 수 없다.)
		
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
			
			// 객체직렬화를 하기 위한 객체 만듦.
			Ex24_VO VO1 = new Ex24_VO("둘리",28,45.2,true);
			Ex24_VO VO2 = new Ex24_VO("고길동",51,81.5,true);
			Ex24_VO VO3 = new Ex24_VO("마이콜",21,42.1,false);
			Ex24_VO VO4 = new Ex24_VO("도우너",5,21.5,true);
			Ex24_VO VO5 = new Ex24_VO("또치",18,45.2,false);
			
			// 객체는 배열이나 컬랙션에 담을 수 있다.
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>();
			list.add(VO1);
			list.add(VO2);
			list.add(VO3);
			list.add(VO4);
			list.add(VO5);
			
			// 객체 직렬화
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
