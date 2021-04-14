/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.studentlibrary;

/**
 * @author Lenovo
 *
 */
public class Student implements Runnable {

	private int id;
	private Book[] books;

	public Student(int id, Book[] books) {
		super();
		this.id = id;
		this.books = books;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Book book = books[(int) (Math.random() * Constant.NUMBER_OF_BOOK)];
				book.read(this);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public String toString() {
		return "Student-id=" + id;
	}

}
