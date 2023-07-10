package DependencyInjection;

public class Bag {

	int id;
	String brand;
	Book b;
	public String toString()
	{
		return "Book [ id=" + id +", brand=" + brand + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
}
