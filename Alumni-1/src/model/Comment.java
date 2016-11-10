package model;

import java.sql.Date;

public class Comment
{
	private String postID;
	private String firstName;
	private String message;
	private Date date;
	
	public Comment(String postID, String firstName, String message, Date date) {
		this.postID = postID;
		this.firstName = firstName;
		this.message = message;
		this.date = date;
	}

	public String getPostID() {
		return postID;
	}

	public void setPostID(String postID) {
		this.postID = postID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
