package com.proxy.test;

import com.proxy.Image;
import com.proxy.ProxyImage;

public class Test2 {
	
	public static void main(String[] args)
	{
		Image img1 = new ProxyImage("River.jpg");
		Image img2 = new ProxyImage("Mountain.jpg");
		Image img3 = new ProxyImage("Lake.jpg");

//		img1.display();
//		img2.display();
		img3.display();
	}

}
