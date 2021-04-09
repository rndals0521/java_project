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
				System.out.print("�̸�:");
				String name = sc.next();
				System.out.println("����:");
				int kor = sc.nextInt();
				System.out.println("����:");
				int eng =sc.nextInt();
				System.out.println("����:");
				int math = sc.nextInt();
				Ex25_VO vo = new Ex25_VO(name,kor,eng,math);
				
				list.add(vo);  // �̰Ŵ� �����ڸ� ���� ���� ���� ��� ���ϴ� �Ű� �����ߴ��Ŵ� ������ �޾� �Ѱܼ� �ű⼭ ����ϴ°ɷ�
							   // ������ �������� �ڵ�� ��������... ������ �� ��� �ȳ�.. ��ü�� ���� �����ؼ� ���� �������ƴ� ���� �ް� �� ��ü�� �ѱ�°ɷ�
				
				
				while(true) {  // �̰Ŵ� while�� �߰��� ���� �߰����߾��� �߰��ؼ� ����Է��ұ�並 �ݺ��ϴµ�..n�� �ƴ� ��쿡 �ٽ� ����°Ÿ� �ٸ���?
					System.out.println("��� �Է��ұ��?(y/n)");
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
