package com.monocept.model;

import java.util.*;

public class CRUDoperationHashSet {
	
	public static void main(String[] args)
	{
		Set<String> s = new HashSet<>();
		
		// Create
		s.add("Asif");
		s.add("Nongamba");
		s.add("Faisal");
		s.add("Ankit");
				
		// Read
		System.out.println("Reading the whole set");
		System.out.println(s);
		System.out.println();
		
		System.out.println("Reading from iteration");
		for(String str : s)
		{
			System.out.println(str);
		}
		System.out.println();
		
		// Update
		System.out.println("Updating the set");
		s.remove("Faisal");
		s.add("Anu");
		System.out.println(s);
		System.out.println();
		
		// Remove
		System.out.println("Removing form set");
		s.remove("Faisal");
		System.out.println(s);
		System.out.println();
		
		System.out.println("Remove all elements form set");
		s.clear();
		System.out.println(s);
	}

}
