package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTestColour {
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		r.setColour("yellow");
		r.setWidth(10);
		r.setHeight(40);
		printDetails(r);
		
	}
	public static void printDetails(Rectangle r)
	{
		System.out.println("Width = " + r.getWidth());
		System.out.println("Height = " + r.getHeight());
		System.out.println("Colour is = " + r.getColour());
	}
	

}
