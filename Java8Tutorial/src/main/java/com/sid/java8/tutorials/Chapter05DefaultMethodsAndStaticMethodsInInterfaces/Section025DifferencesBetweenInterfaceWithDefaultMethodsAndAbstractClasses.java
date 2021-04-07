/**
 * 
 */
package com.sid.java8.tutorials.Chapter05DefaultMethodsAndStaticMethodsInInterfaces;

import com.sid.java8.tutorials.Chapter05DefaultMethodsAndStaticMethodsInInterfaces.intf.IDefault2Intf;
import com.sid.java8.tutorials.Chapter05DefaultMethodsAndStaticMethodsInInterfaces.intf.IDefaultIntf;

/**
 * @author Lenovo
 *
 */
public class Section025DifferencesBetweenInterfaceWithDefaultMethodsAndAbstractClasses
		implements IDefaultIntf, IDefault2Intf {

	private static void staticMethod() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Section025DifferencesBetweenInterfaceWithDefaultMethodsAndAbstractClasses abstractClasses = new Section025DifferencesBetweenInterfaceWithDefaultMethodsAndAbstractClasses();
		abstractClasses.method();
		IDefaultIntf.staticMethod();
		IDefault2Intf.staticMethod();
		Section025DifferencesBetweenInterfaceWithDefaultMethodsAndAbstractClasses.staticMethod();
	}

	@Override
	public void method() {
		System.out.println("This is my implementation");
		IDefaultIntf.super.method();
		//IDefault2Intf.super.method();
	}

}
