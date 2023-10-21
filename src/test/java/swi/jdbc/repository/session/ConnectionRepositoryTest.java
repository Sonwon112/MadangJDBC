package swi.jdbc.repository.session;

import swi.jdbc.model.Book;
import swi.jdbc.model.Customer;
import swi.jdbc.model.Order;

public class ConnectionRepositoryTest {

	ConnectionRepository connectionRepository = new ConnectionRepository();
	
	public String selectCustomerFindByCustId(int custid) {
		Customer customer = connectionRepository.selectCustomerFindByCustId(custid);
		try {
			return customer.toString();
		}catch(NullPointerException e) {
			return "데이터가 없습니다";
		}
		
	}
	
	public String selectBookFindBybookId(Long bookid) {
		Book book = connectionRepository.selectBookFindBybookId(bookid);
		try {
			return book.toString();
		}catch(NullPointerException e) {
			return "데이터가 없습니다";
		}
		
	}
	
	public String selectOrderFindByOrderId(int orderid) {
		Order order = connectionRepository.selectOrderFindByOrderId(orderid);
		try {
			return order.toString();
		} catch (Exception e) {
			// TODO: handle exception
			return "데이터가 없습니다";
		}
	}
	
	
	public static void main(String[] args) {
		ConnectionRepositoryTest test = new ConnectionRepositoryTest();
		
		System.out.println(test.selectCustomerFindByCustId(1));
		System.out.println(test.selectBookFindBybookId(1L));
		System.out.println(test.selectOrderFindByOrderId(1));
	}

}
