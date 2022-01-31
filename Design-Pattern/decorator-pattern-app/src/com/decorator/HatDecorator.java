package com.decorator;

public class HatDecorator implements Hat {
	
	private Hat hat;
	
	public HatDecorator(Hat hat)
	{
		super();
		this.hat = hat;
	}

	@Override
	public String getName()
	{
		return hat.getName();
	}

	@Override
	public int getPrice()
	{
		return hat.getPrice();
	}

	@Override
	public String getDescription()
	{
		return hat.getDescription();
	}

}
