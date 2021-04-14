/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.diningphilosopher;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Lenovo
 *
 */
public class Chopsticks {
	private int id;
	private Lock lock;

	public Chopsticks(int id) {
		super();
		this.id = id;
		this.lock = new ReentrantLock();
	}

	public boolean pickUp(Philosopher philosopher, State state) throws InterruptedException {
		if (this.lock.tryLock(10, TimeUnit.MILLISECONDS)) {
			System.out.println(philosopher + " picked up the " + state.toString() + " " + this);
			return true;
		}
		return false;
	}

	public void putDown(Philosopher philosopher, State state) throws InterruptedException {
		this.lock.unlock();
		System.out.println(philosopher+" put down "+state.toString());
	}
	@Override
	public String toString() {
		return "Chopsticks [id=" + id + "]";
	}

}
