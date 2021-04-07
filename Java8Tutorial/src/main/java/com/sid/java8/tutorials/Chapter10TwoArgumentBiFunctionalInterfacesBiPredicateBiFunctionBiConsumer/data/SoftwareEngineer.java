/**
 * 
 */
package com.sid.java8.tutorials.Chapter10TwoArgumentBiFunctionalInterfacesBiPredicateBiFunctionBiConsumer.data;

/**
 * @author Lenovo
 *
 */
public class SoftwareEngineer {
	private String name;
	private int age;
	private boolean isHavingGf;

	/**
	 * @param name
	 * @param age
	 * @param isHavingGf
	 */
	public SoftwareEngineer(String name, int age, boolean isHavingGf) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the isHavingGf
	 */
	public boolean isHavingGf() {
		return isHavingGf;
	}

	/**
	 * @param isHavingGf the isHavingGf to set
	 */
	public void setHavingGf(boolean isHavingGf) {
		this.isHavingGf = isHavingGf;
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGf=" + isHavingGf + "]";
	}

}
