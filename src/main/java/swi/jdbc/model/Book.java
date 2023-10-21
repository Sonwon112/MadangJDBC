package swi.jdbc.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Book {
	private Long bookId;
	private String bookName;
	private String publisher;
	private Long price;
}
