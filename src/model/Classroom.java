package model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	
private List<UserAccount> users;

public Classroom() {
	users = new ArrayList<>();
}

public List<UserAccount> getUsers() {
	return users;
	
}
public void addUSerAccount(String na, String pass,String pho) {
	users.add(new UserAccount(na,pass,pho));
	
}
}
