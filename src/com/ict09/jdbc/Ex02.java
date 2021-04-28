package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {

		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속을 위한 정보(3개)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn  = DriverManager.getConnection(url,user,password);
			
			// 3.쿼리문 작성
			String sql = "INSERT INTO customer(custid,name,address,phone) VALUES (6,'손흥민','영국 런던','000-9000-0001')";
			
			// 4. 실제 DB에 보낼 준비
			stmt = conn.createStatement();
			
			// 5. 실제 보내고 결과 받기
			// 이때 결과가 두가지 (select 문과 / select 문이 아닌것(insert,update,delete)
			// select문인 경우
			//rs = stmt.executeQuery(sql);
			
			// select문 아닌 경우
			result = stmt.executeUpdate(sql);
			
			// 결과보기
			//System.out.println(result);
			if(result > 0) {
				System.out.println("삽입 성공");
				sql = "SELECT * FROM customer";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
			}else {
				System.out.println("삽입 실패1");
			}
			
		} catch (Exception e) {
			System.out.println("삽입 실패2");
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
