package com.compare.object;

public class F1  implements Comparable<F1>{

	private String departure;
	private String name;
	private float duration;
	private int price;
	
	
	public F1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public F1(String departure, String name, float duration, int price) {
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




	@Override
	public String toString() {
		return "F1 [departure=" + departure + ", name=" + name + ", duration=" + duration + ", price=" + price + "]";
	}




	



//	@Override
//	public int compareTo(F1 f2) {
//		// TODO Auto-generated method stub
//		String s1=this.name;
//		String s2=f2.name;
//		return s1.compareTo(s2);
//	}
	
	
//	@Override
//	public int compareTo(F1 f2) {
//		// TODO Auto-generated method stub
//		String s1=this.departure;
//		String s2=f2.departure;
//		return s1.compareTo(s2);
//	}
	
	
	@Override
	public int compareTo(F1 f2) {
		// TODO Auto-generated method stub
		Integer s1=this.price;
		Integer s2=f2.price;
		return s1.compareTo(s2);
	}
	
	
	
	
}
