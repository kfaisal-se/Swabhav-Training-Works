package com.monocept.chap8;

import com.monocept.chap8.NewPhone;

public class AbstractClass {
	public static void main(String[] args)
	{
		NewPhone myPhone = new NewPhone3();
		myPhone.call();
		myPhone.message();
		myPhone.video();
		myPhone.music();
	}
}
