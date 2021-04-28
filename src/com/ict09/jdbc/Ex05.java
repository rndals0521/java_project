package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
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
			
			String sql = "INSERT INTO student_tb(No,name,det,addr,tel) VALUES(10,'������','ȸ���а�','û��','010-8888-9999') ";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("���� ����");
				
				sql = "SELECT * FROM student_tb";
				stmt = conn.createStatement(); //�ٽ��ѹ� �Ƚ��൵ �������
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getInt("No")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("det")+"\t");
					System.out.print(rs.getString("addr")+"\t");
					System.out.println(rs.getString("tel"));
				}
			}else {
				System.out.println("���� ����-1");
			}
			
		} catch (Exception e) {
			System.out.println("���� ����-2");
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
