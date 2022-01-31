package com.monocept.test;

import com.monocept.StatusBar;
import com.monocept.Stock;
import com.monocept.StockListView;

public class Test {
	
	public static void main(String[] args)
	{
		StatusBar sb = new StatusBar();
		StockListView sv = new StockListView();
		
		Stock s1 = new Stock("Stock1", 10);
		Stock s2 = new Stock("Stock2", 20);
		Stock s3 = new Stock("Stock3", 30);
		
		sb.addStock(s1);
		sb.addStock(s2);
		
		sv.addStock(s1);
		sv.addStock(s2);
		sv.addStock(s3);
		
		s1.setPrice(25);
		s2.setPrice(55);
		
		sb.showPopularStock();
		sv.showAllStock();
		
	}

}
