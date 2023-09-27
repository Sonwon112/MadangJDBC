package swi.jdbc.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Customer {
	private Long custId;
	private String name;
	private String address;
	private String phone;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		result.append("id : "+custId+"\n");
		result.append("name : "+name+"\n");
		result.append("address : "+address+"\n" );
		result.append("phone : "+phone);
		
		return result.toString();
	}
	
}
