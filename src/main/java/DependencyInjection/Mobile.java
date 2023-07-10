package DependencyInjection;

public class Mobile {
int id;
String brand;
double price;
Battery b;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Battery getB() {
	return b;
}
public void setB(Battery b) {
	this.b = b;
}


 public String toString()
 {
	 return "id= "+id+" brand= "+brand+" price= "+price;
 }
}