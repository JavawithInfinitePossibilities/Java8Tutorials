/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

/**
 * @author Lenovo <br/>
 *         If the super class constructor is private then we can't create a subclass. <br/>
 *         The subclass constructor will search for the super class constructor which <br/>
 *         not visible. Which makes the constructor fail. <br/>
 *         By declaring a class as final, JVM will make sure that the class mustn't inherited <br/>
 *         to its subclass. By which we will make sure that the properties like Date and Object
 *         shouldn't be accessed outside singleton class with it getter method too.
 */
public class ClassWithPrivateConstructor {
	private int id;
	private String name;

	/**
	 * 
	 */
	private ClassWithPrivateConstructor() {
	}

	/**
	 * @param id
	 * @param name
	 */
	private ClassWithPrivateConstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
