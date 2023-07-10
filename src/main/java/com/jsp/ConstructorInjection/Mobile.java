package com.jsp.ConstructorInjection;

public class Mobile {

	int id;
	String brand;
	Sim s;
	Mobile(int id, String brand, Sim s)
	{
		this.id=id;
		this.brand=brand;
		this.s=s;
	}
}
