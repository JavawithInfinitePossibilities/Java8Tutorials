/**
 * 
 */
package com.sid.java8.tutorials.Chapter15.subpackage;

/**
 * @author Lenovo <br/>
 *         what is the difference between the interface and abstract class in
 *         java-8. <br/>
 *         1.an interface can have default and static methods along with
 *         abstract methods. Interfaces don’t support final methods. But,
 *         abstract classes support final as well as non-final methods and
 *         static as well as non-static methods along with abstract
 *         methods.<br/>
 *         Interfaces can’t have constructors. Abstract classes can have any
 *         number of constructors.<br/>
 * 
 *         what is the benefit of adding default and static method in interface?
 *         This feature enables us to add new functionality in the interfaces
 *         without breaking the existing contract of the implementing classes.
 *         1. Reduce the code redundancy <br/>
 *         2. Code re-usability
 */
public interface IMyInterface {
	void mymethod();

	default void myDefaultMethod() {

	}

	static void myStaticMethod() {

	}
}
