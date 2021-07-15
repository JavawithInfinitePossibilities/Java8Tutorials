/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

import com.sid.java8.tutorials.Chapter15.subpackage.AGeneralClass;

/**
 * @author Lenovo <br/>
 *         A default method can only inherits in the same package and Protected
 *         method inherits to a subclass outside the package.
 */
public class AGeneralOutsidePackageClass extends AGeneralClass {

	@Override
	public void myPublicMethod() {
		super.myPublicMethod();
	}

	@Override
	protected void myProtectedMethod() {
		super.myProtectedMethod();
	}

}
