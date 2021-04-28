package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06_1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
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
			
			esc:while(true) {
				System.out.print("학번:");
				int no = sc.nextInt();
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("학과:");
				String det = sc.next();
				System.out.println("주소:");
				String addr = sc.next();
				System.out.println("번호:");
				String tel = sc.next();
				
				//받은 정보저장
				list.add(new VO(no,name,det,addr,tel));
				while(true) {
					System.out.println("계속할까요?(y/n)");
					String msg = sc.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}else {
						continue;
					}
				}
			}
			//저장정보 처리 (DB입력)
			for (int i = 0; i < list.size(); i++) {
				String sql = "INSERT INTO student_tb(No,name,det,addr,tel)"
							+" VALUES("+list.get(i).getNo()+",'"+list.get(i).getName()+"','"+list.get(i).getDet()+"','"+list.get(i).getAddr()+"','"+list.get(i).getTel()+"')";
				
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				if(result<0) {
					System.out.println("오류발생");
				}
			}
			String sql = "SELECT * FROM student_tb";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("번호\t이름\t학과\t주소\t번호");
			while(rs.next()) {
				System.out.print(rs.getInt("No")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("det")+"\t");
				System.out.print(rs.getString("addr")+"\t");
				System.out.println(rs.getString("tel"));
				
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
