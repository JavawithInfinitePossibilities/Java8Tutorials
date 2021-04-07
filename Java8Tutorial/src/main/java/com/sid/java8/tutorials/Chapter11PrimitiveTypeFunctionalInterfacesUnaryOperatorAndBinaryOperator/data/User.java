/**
 * 
 */
package com.sid.java8.tutorials.Chapter11PrimitiveTypeFunctionalInterfacesUnaryOperatorAndBinaryOperator.data;

/**
 * @author Lenovo
 *
 */
public class User {
	private String userName;
	private String password;

	public User(String username, String password) {
		this.userName = username;
		this.password = password;
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
		return "User [userName=" + userName + ", password=" + password + "]";
	}

}
