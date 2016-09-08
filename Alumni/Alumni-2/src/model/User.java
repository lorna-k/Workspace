package model;

public class User 
{
	private String userID;
	private String firstName;
	private String lastName;
	private String passWord;
	private String accountType;
	private String email;
	
	public User(String userID, String firstName, String lastName,String email, String passWord, String accountType) {
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.accountType = accountType;
		this.email = email;
	}

	public String getUserID() {
		return this.userID;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAccountType() {
		return accountType;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	

}
