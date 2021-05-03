package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DAO dao = new DAO();
		
		esc:while(true){
			System.out.println(" 1.[ ���� 2.���� 3.���� 4.�˻� 5.��ü�˻� ] \n�۾��� �����ϼ���.");
			String n = sc.next();
			switch(n) {
				case "1": 
					System.out.println("å��ȣ�Է�:");
					int bi = sc.nextInt();
					System.out.println("å�̸��Է�:");
					String bn = sc.next(); // next()�� ���⸦ ����.
					System.out.println("���ǻ��Է�:");
					String pub = sc.next();
					System.out.println("���� �Է�:");
					int p = sc.nextInt();
					dao.DAO_Insert(bi, bn, pub, p);
				break;
				case "2": 
					System.out.println("������ å ��ȣ �Է� : ");
					int bi2 = sc.nextInt();
					dao.DAO_Delete(bi2);
				break;
				case "3": 
					System.out.println("������ ������ å ��ȣ �Է� :");
					int bi3 = sc.nextInt();
					System.out.println("������ å�̸� : ");
					String bn2 = sc.next();
					System.out.println("������ ���ǻ� : ");
					String pub2 = sc.next();
					System.out.println("������ ���� : ");
					int p2 = sc.nextInt();
					dao.DAO_Update(bi3,bn2,pub2,p2);
				break;
				case "4": 
					System.out.println("�˻��� å ��ȣ�� �Է� : ");
					int bi4 = sc.nextInt();
					ArrayList<VO> vos = dao.DAO_Select(bi4);
					for (VO vo : vos) {
						System.out.println(vo.getBookid()+"\t"+vo.getBookname()+"\t"+vo.getPublisher()+"\t"+vo.getPrice());
					}
				break;
				case "5":
					ArrayList<VO> vos2 = dao.DAO_SelectALL();
					for (VO vo : vos2) {
						System.out.println(vo.getBookid()+"\t"+vo.getBookname()+"\t"+vo.getPublisher()+"\t"+vo.getPrice());
					}
				break;
				default: System.out.println("����� �����ϼ���");continue esc;
			}
			
			while(true) {
				System.out.println("����ұ��(y/n) ?");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}
			}
		}
		
				
		
		
	}
}
