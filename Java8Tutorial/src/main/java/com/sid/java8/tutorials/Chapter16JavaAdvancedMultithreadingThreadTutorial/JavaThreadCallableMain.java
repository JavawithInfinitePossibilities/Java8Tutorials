/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaThreadCallable;

/**
 * @author Lenovo
 *
 */
public class JavaThreadCallableMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		for (int i = 0; i < 10; i++) {
			list.add(executorService.submit(new JavaThreadCallable()));
		}
		list.stream().forEach((futureObject) -> {
			try {
				Integer valueInteger = futureObject.get();
				System.out.println("Future value : " + valueInteger);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});
	}

}
