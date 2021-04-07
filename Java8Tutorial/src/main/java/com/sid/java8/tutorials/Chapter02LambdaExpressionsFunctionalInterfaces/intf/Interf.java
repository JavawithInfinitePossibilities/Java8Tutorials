/**
 * 
 */
package com.sid.java8.tutorials.Chapter02LambdaExpressionsFunctionalInterfaces.intf;

/**
 * @author Lenovo
 *
 */
@FunctionalInterface
public interface Interf {
	public void method1();

	public default void method2Default() {
		System.out.println("This is a default method.");
	}

	public static void method3Static() {
		System.out.println("This is a Static method.");
	}
}
