package com.monocept;

public class UserDTO {
	
	private String firstName;
	private String lastName;
	private String email;
	
	public UserDTO(String firstName, String lastName, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	public String email()
	{
		return email;
	}

}
