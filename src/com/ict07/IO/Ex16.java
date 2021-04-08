package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// BufferdWrite : 속도 향상을 위해 사용. 줄바꾸기 메소드가 존재한다.
		
		
		String pathname = "c:" + File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 한글자 쓰기
			bw.write(97);
			bw.write(65);
			
			// int 이므로 char로 대처할 수 있다.
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write("대"); //FileOutputStream은 안되지만 FileWriter는 가능
			bw.write("한"); //FileOutputStream은 안되지만 FileWriter는 가능
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'대','한','민','국',13};
			bw.write(c);
			
			bw.write("korea는 대한민국");
			bw.newLine(); // 줄 변경 메소드
			bw.write("1강의장");
			bw.newLine();
			bw.write("자바수업");
			bw.newLine();           // 문자는 이렇게 쓰는게 최종본..
			
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				
			} catch (Exception e2) {
			}
		}
		
		
		// FileInputStream (바이트) : 1byte 처리, write(int b), write(byte[] b) => 숫자(ASCII코드)  
		// FileReader (문자)        :
	}
}
