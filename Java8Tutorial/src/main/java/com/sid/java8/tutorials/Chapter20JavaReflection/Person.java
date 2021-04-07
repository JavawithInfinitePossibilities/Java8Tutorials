/**
 * 
 */
package com.sid.java8.tutorials.Chapter20JavaReflection;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Lenovo
 *
 */
public class Person implements Comparable<Person>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	private String Name;
	private Date dob;

	/**
	 * @param id
	 * @param name
	 * @param dob
	 */
	public Person(int id, String name, Date dob) {
		super();
		this.id = id;
		Name = name;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + ", dob=" + dob + "]";
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.id, o.getId());
	}

}
