/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

import com.sid.java8.tutorials.Chapter15.subpackage.IMyInterface;

/**
 * @author Lenovo <br/>
 *         A default method in interface is not exactly same as default method
 *         in class. It can be inherited to a subclass outside the package.
 *
 */
public class MyClassOutOfPackage implements IMyInterface {

	@Override
	public void mymethod() {

	}

	@Override
	public void myDefaultMethod() {
		IMyInterface.super.myDefaultMethod();
	}

}
