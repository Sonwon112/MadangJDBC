package swi.jdbc.repository.session;

import swi.jdbc.model.Customer;

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
	
	
	public static void main(String[] args) {
		ConnectionRepositoryTest test = new ConnectionRepositoryTest();
		
		System.out.println(test.selectCustomerFindByCustId(1));
	}

}
