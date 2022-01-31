package com.decorator.test;

import com.decorator.GoldenHat;
import com.decorator.Hat;
import com.decorator.PremiumHat;
import com.decorator.RibbonHat;
import com.decorator.StandardHat;

public class Test {
	
	public static void main(String[] args)
	{
		Hat h1 = new RibbonHat(new GoldenHat(new StandardHat()));
		System.out.println(h1.getName());
		System.out.println(h1.getPrice());
		System.out.println(h1.getDescription());
		System.out.println();
		
		Hat h2 = new GoldenHat(new PremiumHat());
		System.out.println(h2.getName());
		System.out.println(h2.getPrice());
		System.out.println(h2.getDescription());
	}

}
