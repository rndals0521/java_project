package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_Output {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pathname ="C:" + File.separator + "study" + File.separator + "util" + File.separator
				+ "ict09.ser";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<Ex25_VO> list = new ArrayList<Ex25_VO>();
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
				Ex25_VO vo = new Ex25_VO(name,kor,eng,math);
				
				list.add(vo);  // 이거는 생성자를 통해 총점 학점 평균 구하는 거고 내가했던거는 점수만 받아 넘겨서 거기서 계산하는걸로
							   // 교수님 버전으로 코드는 수정했음... 내가한 거 기억 안나.. 객체를 먼저 생성해서 값을 변수가아닌 직접 받고 그 객체를 넘기는걸로
				
				
				while(true) {  // 이거는 while문 추간데 나는 추가안했었음 추가해서 계속입력할까요를 반복하는데..n가 아닌 경우에 다시 물어보는거만 다른가?
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
