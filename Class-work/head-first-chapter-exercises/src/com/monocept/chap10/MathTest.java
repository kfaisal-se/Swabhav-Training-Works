package com.monocept.chap10;

import java.util.*;
//import java.lang.Math.abs();

public class MathTest {
	public static void main(String[] args)
	{
		int a = 500;
		int b = 600;
		
		//returns the minimum value
		int min = Math.min(a,b);
		System.out.println(min);
		
		//returns the maximum value
		int max = Math.max(a,b);
		System.out.println(max);
		
		//returns the randomize value
		int x = (int) (Math.random() * 5);
		System.out.println(x);
		
		//returns the nearest value
		int r = (int) Math.round(55.9d);
		System.out.println(r);
		
		//returns the absolute value
		int ab = Math.abs(-582);
		System.out.println(ab);
	}

}

