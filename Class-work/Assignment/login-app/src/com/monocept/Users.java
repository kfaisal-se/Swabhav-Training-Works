package com.monocept;

public class Users {
	
	private String userId;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String creteDate;
	
	public Users(String userId, String firstName, String lastName, String password, String email, String createDate)
	{
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.creteDate = createDate;
	}
	
	UserDTO ud = new UserDTO(firstName, lastName, email);

}
