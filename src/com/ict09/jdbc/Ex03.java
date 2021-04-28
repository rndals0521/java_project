package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			
			String sql = "UPDATE customer SET name = '����ȣ', address = '���ѹα� ����' WHERE custid = 7";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			//System.out.println(result);
			if(result>0) {
				System.out.println("���� ����");
				
				sql = "select * from customer";
				//stmt = conn.createStatement(); // �Ƚᵵ �Ǵ°ǰ�?
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
			}else {
				System.out.println("���� ����-1");
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
