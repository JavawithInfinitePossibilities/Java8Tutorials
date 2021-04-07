/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

/**
 * @author Lenovo
 *
 */
public class Child extends Parent {
	private static int i = 0;

	public static void childStaticMethod() {
		System.out.println("child Static method");
	}

	static {
		System.out.println("child Static block");
	}

	{
		System.out.println("child Instance block");
	}

	/**
	 * 
	 */
	public Child() {
		System.out.println("Child Constractor...");
	}

}
