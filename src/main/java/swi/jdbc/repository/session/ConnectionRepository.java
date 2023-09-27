package swi.jdbc.repository.session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import swi.jdbc.model.Book;
import swi.jdbc.model.Customer;

public class ConnectionRepository {
	
	@SuppressWarnings("deprecation")
	private Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/madang_example", 
					"madang", "madang");
		}catch (Exception e) {
			// TODO: handle exception
			throw new IllegalStateException(e);
		}
	}
	
	public Customer selectCustomerFindByCustId(int custid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer customer = new Customer();
		try{
			conn = getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT custId, name, address, phone ");
			sql.append("FROM Customer ");
			sql.append("WHERE custId = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, custid);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				customer.setCustId(rs.getLong(1));
				customer.setName(rs.getString(2));
				customer.setAddress(rs.getString(3));
				customer.setPhone(rs.getString(4));
			}
			
		}catch(Exception e){
			
		}
		
		return customer;
	}
	
	public Book selectBookFindBybookId(int bookid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book book = new Book();
		try{
			conn = getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT bookId, booknName, publisher, price ");
			sql.append("FROM Book ");
			sql.append("WHERE bookId = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, bookid);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				book.setBookId(rs.getLong(1));
				book.setBookName(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getLong(4));
			}
			
		}catch(Exception e){
			
		}
		
		return book;
	}
	
	
}
