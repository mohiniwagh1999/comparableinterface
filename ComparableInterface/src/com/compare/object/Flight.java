package com.compare.object;

import java.util.ArrayList;
import java.util.TreeSet;

public class Flight {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	F1 f1=new F1("21.00","indigo",2.5f,9000);
	
	F1 f2=new F1("25.00","vistara",3.5f,6000);
	F1 f3=new F1("12.00","air india",4.5f,7000);
	F1 f4=new F1("13.00","indigo",5.5f,8000);
	
	TreeSet<F1> a=new TreeSet<F1>();
	a.add(f1);
	a.add(f2);
	a.add(f3);
	a.add(f4);
	
	for(F1 f:a)
	{
		System.out.println(f);
	}

	}

}
