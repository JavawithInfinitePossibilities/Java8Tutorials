/**
 * 
 */
package com.sid.java8.tutorials.Chapter02LambdaExpressionsFunctionalInterfaces;

import com.sid.java8.tutorials.Chapter02LambdaExpressionsFunctionalInterfaces.intf.Interf;

/**
 * @author Lenovo
 *
 */
public class Section006FunctionalInterfaceAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Interf interf = () -> {
			System.out.println("This is an functional interface..");
		};
		interf.method1();
	}

}
