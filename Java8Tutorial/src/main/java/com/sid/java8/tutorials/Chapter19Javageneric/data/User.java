/**
 * 
 */
package com.sid.java8.tutorials.Chapter19Javageneric.data;

/**
 * @author Lenovo
 *
 */
public class User implements Comparable<User> {
	private Integer id;
	private String userName;
	private String password;

	public User(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

	@Override
	public int compareTo(User o) {
		return this.getId().compareTo(o.getId());
	}

}
