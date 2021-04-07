/**
 * 
 */
package com.sid.java8.tutorials.Chapter05DefaultMethodsAndStaticMethodsInInterfaces.intf;

/**
 * @author Lenovo
 *
 */
public interface IDefaultIntf {
	public default void method() {
		System.out.println("This is left interface default method...");
	}

	public static void staticMethod() {
		System.out.println("This is left interface Static method...");
	}

}
