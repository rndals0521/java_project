package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_Output {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pathname ="C:" + File.separator + "study" + File.separator + "util" + File.separator
				+ "ict11.ser";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<Ex27_VO> list = new ArrayList<Ex27_VO>();
			esc:
			while(true) {
				System.out.print("이름:");
				String name = sc.next();
				System.out.println("국어:");
				int kor = sc.nextInt();
				System.out.println("영어:");
				int eng =sc.nextInt();
				System.out.println("수학:");
				int math = sc.nextInt();
				Ex27_VO vo = new Ex27_VO(name,kor,eng,math);
				
				list.add(vo);  
				
				while(true) {  
					System.out.println("계속 입력할까요?(y/n)");
					String str = sc.next();
					if(str.equalsIgnoreCase("y")) {
						continue esc;
					}else if(str.equalsIgnoreCase("n")){
						break esc;
					}else {
						continue;
					}
				}
			}
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
