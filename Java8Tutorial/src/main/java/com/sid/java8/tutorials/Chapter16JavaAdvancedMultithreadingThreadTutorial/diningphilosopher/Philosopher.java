/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.diningphilosopher;

import java.util.Random;

/**
 * @author Lenovo
 *
 */
public class Philosopher implements Runnable {

	private int id;
	private Chopsticks leftChopstick;
	private Chopsticks rightChopstick;
	private Random random;
	private int counter;
	private volatile boolean isFull = false;

	public Philosopher(int id, Chopsticks leftChopstick, Chopsticks rightChopstick) {
		super();
		this.id = id;
		this.leftChopstick = leftChopstick;
		this.rightChopstick = rightChopstick;
		this.random = new Random();
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		while (!this.isFull) {
			try {
				think();
				if (leftChopstick.pickUp(this, State.LEFT)) {
					if (rightChopstick.pickUp(this, State.RIGHT)) {
						eat();
						rightChopstick.putDown(this, State.RIGHT);
					}
					leftChopstick.putDown(this, State.RIGHT);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void think() throws InterruptedException {
		System.out.println(this + " is thinking...");
		Thread.sleep(random.nextInt(1000));
	}

	private void eat() throws InterruptedException {
		System.out.println(this + " is eating...");
		this.counter++;
		Thread.sleep(random.nextInt(1000));
	}

	@Override
	public String toString() {
		return "Philosopher-id=" + id;
	}

}
