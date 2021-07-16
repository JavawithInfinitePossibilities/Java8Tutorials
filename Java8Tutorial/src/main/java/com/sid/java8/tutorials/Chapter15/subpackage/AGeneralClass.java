/**
 * 
 */
package com.sid.java8.tutorials.Chapter15.subpackage;

/**
 * @author Lenovo <br/>
 *         A default method only be declared inside the interface.
 *         
 */
public class AGeneralClass {

	public void myPublicMethod() {
		System.out.println("Public");
	}

	private void myPrivateMethod() {
		System.out.println("Private");
	}

	protected void myProtectedMethod() {
		System.out.println("Protected");
	}

	void myDefaultMethod() {
		System.out.println("Default");
	}
}
