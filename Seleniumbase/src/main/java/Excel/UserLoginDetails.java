package Excel;

import java.util.Date;

public class UserLoginDetails {
	
	/*
	 * Author Clinton Bates 
	 * This is for the email and passwords excel sheet.
	 */

	private String email;
	private String password;

	public UserLoginDetails(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	}
