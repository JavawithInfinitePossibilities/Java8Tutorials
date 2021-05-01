/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.forkjoin.returnvalue;

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
		SimpleRecursiveTask simpleRecursiveAction = new SimpleRecursiveTask(120);
		System.out.println(forkJoinPool.invoke(simpleRecursiveAction));
	}

}
