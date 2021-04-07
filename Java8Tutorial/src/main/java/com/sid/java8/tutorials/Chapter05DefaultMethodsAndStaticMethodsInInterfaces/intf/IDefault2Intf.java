/**
 * 
 */
package com.sid.java8.tutorials.Chapter05DefaultMethodsAndStaticMethodsInInterfaces.intf;

/**
 * @author Lenovo
 *
 */
public interface IDefault2Intf {
	public default void method() {
		System.out.println("This is Right interface default method...");
	}

	public static void staticMethod() {
		System.out.println("This is Right interface Static method...");
	}

}
