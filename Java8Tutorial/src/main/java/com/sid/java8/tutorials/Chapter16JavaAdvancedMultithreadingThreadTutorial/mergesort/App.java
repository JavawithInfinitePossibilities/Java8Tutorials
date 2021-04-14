/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.mergesort;

import java.util.Random;

/**
 * @author Lenovo
 *
 */
public class App {
	public static Random random = new Random();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of threads/cores: " + numOfThreads);
		int[] numbers = createRandomArray();
		MergeSort mergeSort = new MergeSort(numbers);
		long startTime1 = System.currentTimeMillis();
		mergeSort.mergeSort(0, numbers.length - 1);
		long endTime1 = System.currentTimeMillis();
		//mergeSort.showResult();
		System.out.printf("Time taken for 100 000 000 elements sequential =>  %6d ms \n", endTime1 - startTime1);
		System.out.println("");
		
		
		startTime1 = System.currentTimeMillis();
		mergeSort.parallelMergeSort(0, numbers.length-1, numOfThreads);
		//mergeSort.showResult();
		endTime1 = System.currentTimeMillis();
		System.out.printf("Time taken for 100 000 000 elements Parallel =>  %6d ms \n", endTime1 - startTime1);
	}

	public static int[] createRandomArray() {
		int[] a = new int[100000];
		for (int i = 0; i < 100000; i++) {
			a[i] = random.nextInt(100000);
		}
		return a;
	}
}
