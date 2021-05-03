package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03 {
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
			String sql = "insert into book values(?,?,?,?)";
			
			// ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			// ���ε� ���� ó��
			pstmt.setInt(1,15);
			pstmt.setString(2,"�� ���̺�");
			pstmt.setString(3,"���ѹ̵��");
			pstmt.setInt(4,18000);
			
			// ���� DB�� �����ϰ� ��� �ޱ�
			result = pstmt.executeUpdate();
			
			if(result>0) {
				sql = "select * from book order by bookid asc";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.print(rs.getInt("bookid")+"\t");
					System.out.print(rs.getString("bookname")+"\t");
					System.out.print(rs.getString("publisher")+"\t");
					System.out.println(rs.getInt("price"));
				}
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
