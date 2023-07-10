package com.jsp.ConstructorInjection;

public class Remote {

	int id;
	String brand;
	Battery b;
	
	Remote(int id, String brand, Battery b)
	{
		this.id=id;
        this.brand=brand;
        this.b=b;
	}
}
