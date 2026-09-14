package cdac.coreJava.day1.Assignment;

import java.util.*;

public class LoginCredential {
	Scanner sc = new Scanner(System.in);
	String name;
	int password;
	
	public void insert() {
		System.out.println("Enter username: ");
		name = sc.next();
		System.out.println("Enter password: ");
		password = sc.nextInt();
	}
	
	public void check() {
		if(name.equals("admin") && password == 1234) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Invalid Username or Password");
		}
	}
	
	public static void main(String[] args) {
		LoginCredential l = new LoginCredential();
		l.insert();
		l.check();
	}

}
