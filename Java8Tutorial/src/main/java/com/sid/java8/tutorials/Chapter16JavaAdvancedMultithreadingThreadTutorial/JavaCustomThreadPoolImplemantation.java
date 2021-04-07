/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.ThreadPoolImplementation.JavaThreadPoolCustomised;

/**
 * @author Lenovo
 *
 */
public class JavaCustomThreadPoolImplemantation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Runnable> tasks = new ArrayList<Runnable>();
		IntStream.range(0, 10).forEach((i) -> {
			Runnable task = () -> {
				System.out.println("Performing task - " + i);
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
			tasks.add(task);
		});
		JavaThreadPoolCustomised threadPoolCustomised = new JavaThreadPoolCustomised(3, 3);
		int taskCount = 0;
		while (taskCount < 10) {
			int index = (int) (Math.random() * 10);
			try {
				threadPoolCustomised.execute(tasks.get(index));
				Thread.sleep(2000);
				if (index == 3) {
					threadPoolCustomised.stop();
				}
				taskCount++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
