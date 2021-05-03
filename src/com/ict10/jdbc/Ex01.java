package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity)는 자바에서 데이터베이스에 접속할 수 있도록 지원하는
		// 자바 API
		
		Connection conn = null;
		PreparedStatement pstmt = null; //statement를 상속받은 인터페이스
		ResultSet rs = null;  // select문의 결과를 받은 클래스로 cursor를 사용해서 정보를 추출
		int result = 0; // select문을 제외한 나머지 결과를 받을 때 사용
				
		
		try {
			// 1. 드라이버로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 접속 정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 쿼리문작성
			String sql = "select * from book order by bookid";
			
			// 쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			
			
			// 실제 DB에 적용하고 결과 받기
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				
			} catch (Exception e2) {
			}
		}
	}
}
