package com.ict07.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		//복사 장소와 파일명을 받고
		//붙이기 장소와 파일명을 받아서 붙이기하자
		Scanner sc = new Scanner(System.in);
		System.out.print("복사할 파일의 주소를 입력하시오.");
		String pathname1 = sc.next();
		System.out.print("복사할 장소의 주소를 입력하시오.");
		String pathname2 = sc.next();
		
		File Rfile = new File(pathname1);
		File Wfile = new File(pathname2);
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(Rfile);
			
			char[] c = new char[(int)Rfile.length()];
			fr.read(c);
			
			fw = new FileWriter(Wfile);
			fw.write(c);
			
			fw.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				
				fw.close();
				fr.close();
				
			} catch (Exception e2) {
			}
		}
		
	}
}
