/**
 * 
 */
package com.sid.java8.tutorials.Chapter15.subpackage;

/**
 * @author Lenovo
 *
 */
public class MyClass implements IMyInterface {

	@Override
	public void mymethod() {
		
	}

	@Override
	public void myDefaultMethod() {
		IMyInterface.super.myDefaultMethod();
	}
	
	

}
