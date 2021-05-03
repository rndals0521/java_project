package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity)�� �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �����ϴ�
		// �ڹ� API
		
		Connection conn = null;
		PreparedStatement pstmt = null; //statement�� ��ӹ��� �������̽�
		ResultSet rs = null;  // select���� ����� ���� Ŭ������ cursor�� ����ؼ� ������ ����
		int result = 0; // select���� ������ ������ ����� ���� �� ���
				
		
		try {
			// 1. ����̹��ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. ���� ����
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// �������ۼ�
			String sql = "select * from book order by bookid";
			
			// ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			
			// ���� DB�� �����ϰ� ��� �ޱ�
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
