package com.monocept;

import java.util.ArrayList;

public class StatusBar implements IView{
	
	ArrayList<Stock> popularStock = new ArrayList<Stock>();

//	@Override
//	public void displayStock()
//	{
//		for(Stock s : popularStock)
//		{
//			System.out.println(s.getName());
//			System.out.println(s.getPrice());
//		}
//	}
	
	@Override
	public void addStock(Stock s)
	{
		popularStock.add(s);
	}
	
	public void showPopularStock()
	{
		for(Stock s : popularStock)
		{
			System.out.println(s.getName());
			System.out.println(s.getPrice());
			System.out.println();
		}
	}

}
