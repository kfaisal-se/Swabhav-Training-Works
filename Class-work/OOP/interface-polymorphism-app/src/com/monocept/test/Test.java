package com.monocept.test;

import com.monocept.model.IEmotion;
import com.monocept.model.IManner;
import com.monocept.model.Man;
import com.monocept.model.Woman;

public class Test {
	
	public static void main(String[] args)
	{
		Man x = new Man();
		Woman y = new Woman();
		
		atTheMovie(x);
//		atTheParty(x);
		
		atTheMovie(y);
		atTheParty(y);
	}

	private static void atTheMovie(IManner o)
	{
		System.out.println("At the movie");
		o.wish();
		o.depart();
		System.out.println();
	}

	private static void atTheParty(IEmotion o)
	{
		System.out.println("At the party");
		o.cry();
		o.laugh();
		System.out.println();
	}

}
