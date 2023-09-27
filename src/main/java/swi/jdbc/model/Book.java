package swi.jdbc.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Book {
	private Long bookId;
	private String bookName;
	private String publisher;
	private Long price;
}
