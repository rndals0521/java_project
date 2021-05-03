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
			System.out.println(" 1.[ 삽입 2.삭제 3.수정 4.검색 5.전체검색 ] \n작업을 선택하세요.");
			String n = sc.next();
			switch(n) {
				case "1": 
					System.out.println("책번호입력:");
					int bi = sc.nextInt();
					System.out.println("책이름입력:");
					String bn = sc.next(); // next()는 띄어쓰기를 못함.
					System.out.println("출판사입력:");
					String pub = sc.next();
					System.out.println("가격 입력:");
					int p = sc.nextInt();
					dao.DAO_Insert(bi, bn, pub, p);
				break;
				case "2": 
					System.out.println("삭제할 책 번호 입력 : ");
					int bi2 = sc.nextInt();
					dao.DAO_Delete(bi2);
				break;
				case "3": 
					System.out.println("가격을 수정할 책 번호 입력 :");
					int bi3 = sc.nextInt();
					System.out.println("수정할 책이름 : ");
					String bn2 = sc.next();
					System.out.println("수정할 출판사 : ");
					String pub2 = sc.next();
					System.out.println("수정할 가격 : ");
					int p2 = sc.nextInt();
					dao.DAO_Update(bi3,bn2,pub2,p2);
				break;
				case "4": 
					System.out.println("검색할 책 번호를 입력 : ");
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
				default: System.out.println("제대로 선택하세요");continue esc;
			}
			
			while(true) {
				System.out.println("계속할까요(y/n) ?");
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
