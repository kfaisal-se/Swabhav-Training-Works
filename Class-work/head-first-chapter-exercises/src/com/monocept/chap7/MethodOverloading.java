package com.monocept.chap7;

public class MethodOverloading {
	public int addNums(int a, int b) {
		return a + b;
	}

	public double addNums(double a, double b) {
		return a + b;
	}

	public static void main(String[] args)
	{
		MethodOverloading md = new MethodOverloading();
		System.out.println(md.addNums(5,5));
		System.out.println(md.addNums(1.2,5.5));
	}
}
