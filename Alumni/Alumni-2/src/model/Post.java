package model;

import java.io.File;

public class Post 
{
	private String postID;
	private String firstName;
	private String lastName;
	private String caption;
	private File profilePic;
	private File file;
	private int likes;
	private String Locatoin;
	
	
	public Post(String postID, String firstName, String lastName, String caption, File profilePic, File file, int likes,String locatoin) 
	{
		this.postID = postID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.caption = caption;
		this.profilePic = profilePic;
		this.file = file;
		this.likes = likes;
		Locatoin = locatoin;
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
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public File getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(File profilePic) {
		this.profilePic = profilePic;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getLocatoin() {
		return Locatoin;
	}
	public void setLocatoin(String locatoin) {
		Locatoin = locatoin;
	}
	
	
	
}
