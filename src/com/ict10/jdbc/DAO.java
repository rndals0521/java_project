package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	int result = 0;
	private String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
	private String user = "test01";
	private String password = "1111";
	
	public DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<VO> DAO_Select(int bookid) {
		ArrayList<VO> vos = new ArrayList<VO>();
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select * from book where bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bookid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bookid2 = rs.getInt("bookid");
				String bookname = rs.getString("bookname");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				VO vo = new VO(bookid2,bookname,publisher,price);
				vos.add(vo);
			}
		} catch (SQLException e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				
			} catch (Exception e2) {
			}
		}
		
		
		
		return vos;
	}
	
	public ArrayList<VO> DAO_SelectALL() {
		
		ArrayList<VO> vos = new ArrayList<VO>();
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select * from book";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bookid2 = rs.getInt("bookid");
				String bookname = rs.getString("bookname");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				VO vo = new VO(bookid2,bookname,publisher,price);
				vos.add(vo);
			}
		} catch (SQLException e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				
			} catch (Exception e2) {
			}
		}
		
		
		
		return vos;
	}
	
	public void DAO_Insert(int bookid, String bookname,String publisher, int price) {
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into book values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bookid);
			pstmt.setString(2, bookname);
			pstmt.setString(3, publisher);
			pstmt.setInt(4, price);
			
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
				System.out.println("삽입 실패.");
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
	
	
	
	public void DAO_Delete(int bookid) {
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "delete from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bookid);
			
			
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
				System.out.println("삭제 실패.");
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
	
	public void DAO_Update(int bookid,String bookname, String publisher,int price) {
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "update book set bookname =? , set publisher =?, set price =?  where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookname);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			pstmt.setInt(4, bookid);
			
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
				System.out.println("가격 수정 실패.");
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
