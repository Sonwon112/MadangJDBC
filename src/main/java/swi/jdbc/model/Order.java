package swi.jdbc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Order {
	private Long orderId;
	private Long custId;
	private Long bookId;
	private Long salePrice;
	private String orderDate;
}
