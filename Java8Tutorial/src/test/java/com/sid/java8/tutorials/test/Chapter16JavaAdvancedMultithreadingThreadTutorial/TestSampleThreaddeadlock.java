/**
 * 
 */
package com.sid.java8.tutorials.test.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.ThreadDeadlockExample;

/**
 * @author Lenovo
 *
 */
public class TestSampleThreaddeadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object object = new Object();
		Object object2 = new Object();
		new Thread(new ThreadDeadlockExample(object, object2)).start();
		new Thread(new ThreadDeadlockExample(object2, object)).start();

	}

}
