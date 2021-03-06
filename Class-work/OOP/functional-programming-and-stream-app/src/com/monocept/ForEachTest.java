package com.monocept;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {
	
	public static void main(String[] args)
	{
		List<String> argsList = Arrays.asList(args);
		argsList.stream()
				.mapToInt(x->Integer.parseInt(x))
				.filter(x->x>=3)
				.forEach(x->System.out.println(x));
//		argsList.forEach(x->System.out.println(x));
	}
	
}
