package com.monocept.chap10;

public class Player {
	static int playerCount = 0;
	private String name;

	public Player(String n) {
		name = n;
		playerCount++;
	}

}
