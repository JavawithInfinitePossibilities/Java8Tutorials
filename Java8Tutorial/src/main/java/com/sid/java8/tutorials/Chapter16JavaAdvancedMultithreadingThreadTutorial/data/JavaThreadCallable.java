/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author Lenovo
 *
 */
public class JavaThreadCallable implements Callable<Integer> {

	private Random random = new Random();

	@Override
	public Integer call() throws Exception {
		Thread.sleep(5000);
		return random.nextInt(100);
	}

}
