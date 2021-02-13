package model;

public class UserAccount {
	private String name;
	private String password;
	private String photo;
	
	public UserAccount(String na, String pass,String pho) {
		name = na;
		password = pass;
		photo = pho;
		
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhoto() {
		return photo;
	}
}
