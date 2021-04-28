package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		VO vo = new VO();
		//데이터를 받아서 VO에 넣자
		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://203.236.220.106/test02db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			
			while(true) {
				System.out.print("번호:");
				vo.setNo(sc.nextInt());
				System.out.print("이름:");
				vo.setName(sc.next());
				System.out.print("학과:");
				vo.setDet(sc.next());
				System.out.print("주소:");
				vo.setAddr(sc.next());
				System.out.print("번호:");
				vo.setTel(sc.next());
				
				String sql = "INSERT INTO student_tb(No,name,det,addr,tel) VALUES("+vo.getNo()+",'"+vo.getName()+"','"+vo.getDet()+"','"+vo.getAddr()+"','"+vo.getTel()+"')";
				
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				
				if(result>0) {
					System.out.println("삽입 성공");
					
					sql = "SELECT * FROM student_tb";
					stmt = conn.createStatement(); //다시한번 안써줘도 상관없나
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						System.out.print(rs.getInt("No")+"\t");
						System.out.print(rs.getString("name")+"\t");
						System.out.print(rs.getString("det")+"\t");
						System.out.print(rs.getString("addr")+"\t");
						System.out.println(rs.getString("tel"));
					}
				}else {
					System.out.println("삽입 실패-1");
				}
				System.out.println("계속 하시겠습니까?:yes->1 / no->0");
				if(sc.nextInt()==0) break;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
