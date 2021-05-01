/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * @author Lenovo
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(400);
		forkJoinPool.invoke(simpleRecursiveAction);
	}

}
