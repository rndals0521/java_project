package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ���� bookid�� �ޱ� ���ؼ� Scanner ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ idx�� �Է��ϼ��� >> ");
		int del_id = sc.nextInt();
		
		
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
			String sql = "delete from book where bookid = ?";
			
			// ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			// ���ε� ���� ó��
			pstmt.setInt(1,del_id);
						
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
			}else {
				System.out.println("������ ���̵� �����ϴ�.");
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
