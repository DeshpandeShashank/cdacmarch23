

class Book {
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book() {
		
		setTitle("Rich Dad Poor Dad");
		setAuthor("Denial");
		setPublisher("Sun publisher");
		setIsbn("SJD4668");
		setYear(2000);
		price = 100.50f;
		quantity = 10;
	}

	public void increaseQuantity(int quan) {
		this.quantity = quantity + quan;
		System.out.println(quantity);
	}

	public void decreaseQuantity(int quan) {
		this.quantity = quantity - quan;
		System.out.println(quantity);
	}

	public double getInventoryValue() {
		return quantity * price;
	}

}

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.increaseQuantity(5);
		book.decreaseQuantity(10);
		System.out.println("Total Value of Inverntory: " + book.getInventoryValue());
		System.out.println("Book Title: " + book.getTitle() + " | author: " + book.getAuthor() + " | publisher: "
				+ book.getPublisher() + " | isbn: " + book.getIsbn() + " | year: " + book.getYear() + " | price: "
				+ book.getPrice() + " | Quantity: " + book.getQuantity());
	}

}
