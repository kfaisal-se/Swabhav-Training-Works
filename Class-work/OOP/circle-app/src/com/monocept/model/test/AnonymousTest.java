package com.monocept.model.test;

import com.monocept.model.Circle;

public class AnonymousTest {
	public static void main(String[] args)
	{
		Circle solid = new Circle();
		solid.setRadius(2.2f);
		solid.setBorder("solid");
		printDetails(new Circle());
		
		Circle doule = new Circle();
		doule.setRadius(5.5f);
		doule.setBorder("double");
		printDetails(new Circle());
		
		Circle dotted = new Circle();
		dotted.setRadius(7.7f);
		dotted.setBorder("zyz");
		printDetails(new Circle());

	}
	
	public static void printDetails(Circle Circle)
	{	
		System.out.println("Radius of anonymous circle is = " + new Circle().getRadius());
		System.out.println("Border of anonymous circle is = " + new Circle().getBorder());
		System.out.println("Area of anonymous circle is = " + new Circle().calculateArea());
		System.out.println();
	}

}
