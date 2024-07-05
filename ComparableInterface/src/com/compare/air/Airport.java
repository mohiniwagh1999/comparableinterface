package com.compare.air;

import java.util.TreeSet;

public class Airport implements Comparable<Airport> {

	
	private String departure;
	private String name;
	private float duration;
	private int price;
	
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}

public Airport(String departure, String name, float duration, int price) {
		super();
		this.departure = departure;
		this.name = name;
		this.duration = duration;
		this.price = price;
	}

	public String getDeparture() {
	return departure;
}

public void setDeparture(String departure) {
	this.departure = departure;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getDuration() {
	return duration;
}

public void setDuration(float duration) {
	this.duration = duration;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String toString() {
	return "Airport [departure=" + departure + ", name=" + name + ", duration=" + duration + ", price=" + price + "]";
}

@Override
public int compareTo(Airport o) {
	// TODO Auto-generated method stub
	String s1=this.departure;
	String s2=o.departure;
	return s1.compareTo(s2);
}

}








class Alpha{

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Airport air1=new Airport("21.00","indigo",4.0f,3000);
	Airport air2=new Airport("2.00","vistara",9.0f,8000);
	Airport air3=new Airport("11.00","airline",3.0f,6700);
	
	TreeSet <Airport> tr=new TreeSet<Airport>();
	tr.add(air1);
	tr.add(air2);
	tr.add(air3);
	
	
	
	
	for(Airport a:tr)
	{
		System.out.println(a);
	}
	

	}

}
