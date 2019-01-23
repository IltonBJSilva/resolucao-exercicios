package AuthorELivro;

public class Book extends Author{
	String name;
	String email;
	char gender;
	Author author;
	double price;
	int qty = 0;
	
	public Book(String name, Author author, double price, String email, char gender) {
		super(name,email, gender);
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty, String email, char gender) {
		super(name,email, gender);
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty+1;
	}

	public void setQty(int qty) {

			this.qty = qty+1;

		
	}

	@Override
	public String toString() {
		return ""
	+ "\nBook name = "+ name
	+ "\nAuthor name = "+ author.getName()
	+ "\nGender = " + author.getGender()
	+ "\nEmail = " + author.getEmail()
	+ "\nBook Price = " + price +" US$"
	+ "\nQuantity = " + qty;
	}
	
	
	
	
	

}
