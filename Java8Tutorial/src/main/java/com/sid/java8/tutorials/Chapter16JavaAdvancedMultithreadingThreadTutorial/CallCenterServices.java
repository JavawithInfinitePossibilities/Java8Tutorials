/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.ThreadPoolImplementation.callcenterservices.CallCenterManager;

/**
 * @author Lenovo
 *
 */
public class CallCenterServices {

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
		CallCenterManager centerManager=new CallCenterManager(3, 3);
		int taskCount = 0;
		while (taskCount < 10) {
			try {
				centerManager.execute(tasks.get(taskCount));
				Thread.sleep(2000);
				taskCount++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
