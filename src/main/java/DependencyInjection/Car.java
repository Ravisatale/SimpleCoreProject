package DependencyInjection;

public class Car {
int id;
String brand;
Engine engine;
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
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}

public String toString()
{
	return "id="+id+"brand="+brand ;
}	
}
