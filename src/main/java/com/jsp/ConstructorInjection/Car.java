package com.jsp.ConstructorInjection;

public class Car {
 int id;
 String brand;
 double price;
 Engine e;
 Car(int id,String brand,double price, Engine e)
 {
	 this.id=id;
	 this.brand=brand;
	 this.price=price;
	 this.e=e;
 }
 
}
