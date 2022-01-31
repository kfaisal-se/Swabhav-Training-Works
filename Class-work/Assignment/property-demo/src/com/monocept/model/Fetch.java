package com.monocept.model;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Fetch {
	
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		InputStream is = new FileInputStream("dataConfig.properties");
		
		p.load(is);
		
		System.out.println(p.getProperty("website"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
		p.list(System.out);
	}

}
