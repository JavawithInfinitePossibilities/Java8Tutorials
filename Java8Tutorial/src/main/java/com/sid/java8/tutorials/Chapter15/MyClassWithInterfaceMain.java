/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

/**
 * @author Lenovo <br/>
 *         Even though the interface contains the main method the child class
 *         will not inherit the main method as the main method is a static
 *         method and can only be used by the class name.
 */
public class MyClassWithInterfaceMain implements IFaceWithMain {
	public static void main(String[] args) {
		System.out.println("My class main...");
		IFaceWithMain.main(null);
	}
}
