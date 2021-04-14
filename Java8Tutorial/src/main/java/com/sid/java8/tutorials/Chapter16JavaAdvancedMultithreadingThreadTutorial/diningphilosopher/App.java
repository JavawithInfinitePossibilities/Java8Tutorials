/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.diningphilosopher;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Philoshoper Dining problem");
		ExecutorService service = Executors.newFixedThreadPool(Constant.NUMBER_OF_PHILOSOPHER);
		Philosopher[] philosophers = new Philosopher[Constant.NUMBER_OF_PHILOSOPHER];
		try {
			Chopsticks[] chopsticks = new Chopsticks[Constant.NUMBER_OF_CHOPSTICK];
			IntStream.range(0, Constant.NUMBER_OF_CHOPSTICK).forEach(i -> chopsticks[i] = new Chopsticks(i));
			IntStream.range(0, Constant.NUMBER_OF_PHILOSOPHER).forEach(i -> {
				philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % Constant.NUMBER_OF_CHOPSTICK]);
				service.execute(philosophers[i]);
			});
			try {
				Thread.sleep(Constant.SIMULATION_RUNNING_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Arrays.asList(philosophers).stream().forEach(philosopher -> {
				philosopher.setFull(true);
			});
		} finally {
			service.shutdown();
			try {
				service.awaitTermination(1, TimeUnit.MINUTES);
				while (service.isShutdown()) {
					Thread.sleep(1000);
				}
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			Arrays.asList(philosophers).stream().forEach(philosopher -> {
				System.out.println(philosopher + " has eaten for " + philosopher.getCounter());
			});
		}

	}

}
