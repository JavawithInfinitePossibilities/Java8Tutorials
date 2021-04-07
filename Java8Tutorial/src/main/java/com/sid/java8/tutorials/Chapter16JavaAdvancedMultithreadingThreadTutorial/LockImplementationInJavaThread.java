/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.LockWorker;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.LockWorkerWithMutx;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.LockWorkerWithSynchronizetion;

/**
 * @author Lenovo
 *
 */
public class LockImplementationInJavaThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LockWorker lockWorker = new LockWorker();
		try {
			lockWorker.main();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LockWorkerWithSynchronizetion lockWorkerWithSynchronizetion = new LockWorkerWithSynchronizetion();
		try {
			lockWorkerWithSynchronizetion.main();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LockWorkerWithMutx lockWorkerWithMutx = new LockWorkerWithMutx();
		try {
			lockWorkerWithMutx.main();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
