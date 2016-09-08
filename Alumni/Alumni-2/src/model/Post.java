package model;

public class Post 
{
	private String postID;
	private String firstName;
	private String lastName;
	private String file;
	private int likes;
	private String postLocatoin;
	
	public Post(String postID, String firstName, String lastName, String file, int likes, String postLocatoin) {
		this.postID = postID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.file = file;
		this.likes = likes;
		this.postLocatoin = postLocatoin;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getPostLocatoin() {
		return postLocatoin;
	}
	public void setPostLocatoin(String postLocatoin) {
		this.postLocatoin = postLocatoin;
	}
}
