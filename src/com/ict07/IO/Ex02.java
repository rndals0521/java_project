package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File 클래스를 사용하기 전에 특정 위치를 지정
		String pathname_1="C:\\study\\util";  //운영체제가 windows 일때
		String pathname_2="C:/study/util";  //운영체제가 Linux 일때
		
		// 운영체제와 상관없이 사용하는 방법
		String pathname_3 = "C:" + File.separator+"study"+File.separator+"util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname_3,k);
			//System.out.println(file2);
			
			//수정날짜 구하기
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2 + "\n크기:크기가 존재하지않음\n" +
							"수정한 날짜 : " + sdf.format(file2.lastModified()));
			}else {
				System.out.println("파일 : " + file2 + "\n크기 : " +(int)file2.length()/1024+"KB\n" +
						"수정한 날짜 : " + sdf.format(file2.lastModified()));
			}
		}
	}
}
