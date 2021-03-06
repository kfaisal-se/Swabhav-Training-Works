package com.ooad.chap2;

public class DogDoorTest {
	
	public static void main(String[] args)
	{
		DogDoor door = new DogDoor();
		Remote r = new Remote(door);
		System.out.println("Fido barks to go outside...");
		r.pressButton();
		
		System.out.println("\nFido has gone outside");
		r.pressButton();
		
		System.out.println("\nFido's all done");
		r.pressButton();
		
		System.out.println("\nFido's back inside");
		r.pressButton();
	}

}