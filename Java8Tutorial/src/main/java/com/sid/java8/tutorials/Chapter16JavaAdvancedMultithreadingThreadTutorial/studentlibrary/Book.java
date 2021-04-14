/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.studentlibrary;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Lenovo
 *
 */
public class Book {
	private int id;
	private Lock lock;

	public Book(int id) {
		super();
		this.id = id;
		this.lock = new ReentrantLock();
	}

	public void read(Student student) throws InterruptedException {
		lock.tryLock();
		System.out.println(student + " start reading " + this);
		Thread.sleep(2000);
		lock.unlock();
		System.out.println(student + " has read the " + this);

	}

	@Override
	public String toString() {
		return "Book-id=" + id;
	}

}
