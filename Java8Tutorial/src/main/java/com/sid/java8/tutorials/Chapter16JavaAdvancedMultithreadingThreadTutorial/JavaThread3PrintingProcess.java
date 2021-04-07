/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaThreadWorkerMgmt;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaThreadWorkerMng;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.Worker;

/**
 * @author Lenovo
 *
 */
public class JavaThread3PrintingProcess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Worker worker = new Worker(20, 1);
		JavaThreadWorkerMng workerMng1 = new JavaThreadWorkerMng(worker, 1, 4);
		Thread thread1 = new Thread(workerMng1);
		JavaThreadWorkerMng workerMng2 = new JavaThreadWorkerMng(worker, 2, 4);
		Thread thread2 = new Thread(workerMng2);
		JavaThreadWorkerMng workerMng3 = new JavaThreadWorkerMng(worker, 3, 4);
		Thread thread3 = new Thread(workerMng3);
		JavaThreadWorkerMng workerMng4 = new JavaThreadWorkerMng(worker, 4, 4);
		Thread thread4 = new Thread(workerMng4);

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		/*executorService.submit(thread1);
		executorService.submit(thread2);
		executorService.submit(thread3);
		executorService.submit(thread4);
		
		//executorService.shutdownNow();
		try {
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		Worker worker1 = new Worker(20, 1);
		worker1.setCondition(1);
		JavaThreadWorkerMgmt workerMgmt1 = new JavaThreadWorkerMgmt(worker1, 1, 4);
		Thread thread1_1 = new Thread(workerMgmt1);
		JavaThreadWorkerMgmt workerMgmt2 = new JavaThreadWorkerMgmt(worker1, 2, 4);
		Thread thread2_2 = new Thread(workerMgmt2);
		JavaThreadWorkerMgmt workerMgmt3 = new JavaThreadWorkerMgmt(worker1, 3, 4);
		Thread thread3_3 = new Thread(workerMgmt3);
		JavaThreadWorkerMgmt workerMgmt4 = new JavaThreadWorkerMgmt(worker1, 4, 4);
		Thread thread4_4 = new Thread(workerMgmt4);
		
		executorService.submit(thread1_1);
		executorService.submit(thread2_2);
		executorService.submit(thread3_3);
		executorService.submit(thread4_4);

		//executorService.shutdownNow();
		try {
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
