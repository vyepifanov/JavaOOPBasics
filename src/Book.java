public class Book {
	private String name;
	private String author;
	private String publisher;
	private int year;

	public Book() {
		this.name = "";
		this.author = "";
		this.publisher = "";
		this.year = 0;
	}

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		this.publisher = "";
		this.year = 0;
	}

	public Book(String name, String author, String publisher) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = 0;
	}

	public Book(String name, String author, String publisher, int year) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
	}

	@Override
	public String toString() {
		return name + ';' + author + ';' + publisher + ';' + year;
	}
}
