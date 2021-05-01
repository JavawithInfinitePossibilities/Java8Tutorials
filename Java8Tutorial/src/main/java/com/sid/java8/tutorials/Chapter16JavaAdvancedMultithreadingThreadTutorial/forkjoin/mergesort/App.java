package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.forkjoin.mergesort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class App {

	public static void main(String[] args) {

		int[] nums = initializeNums();
		System.out.println("sequential :"+Arrays.toString(nums));
		SequentialMergesort mergesort = new SequentialMergesort(nums);
		long start = System.currentTimeMillis();
		mergesort.mergeSort(nums);
		System.out.println("sequential :"+Arrays.toString(nums));
		System.out.println("Time taken with sequential sort: " + (System.currentTimeMillis() - start) + "ms");
		nums = initializeNums();
		System.out.println("Parallel :"+Arrays.toString(nums));
		MergeSortTask rootTask = new MergeSortTask(nums);
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		start = System.currentTimeMillis();
		pool.invoke(rootTask);
		System.out.println("Parallel :"+Arrays.toString(nums));
		System.out.println("Time taken with parallel sort: " + (System.currentTimeMillis() - start) + "ms");
	}

	private static int[] initializeNums() {
		Random random = new Random();
		int[] nums = new int[11];
		for (int i = 0; i < 11; ++i) {
			nums[i] = random.nextInt(100);
		}
		return nums;
	}
}
