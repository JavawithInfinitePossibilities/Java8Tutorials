/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.studentlibrary;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
		ExecutorService service = Executors.newFixedThreadPool(Constant.NUMBER_OF_STUDENT);
		Book[] books = new Book[Constant.NUMBER_OF_BOOK];
		IntStream.range(0, Constant.NUMBER_OF_BOOK).forEach(i -> {
			books[i] = new Book(i);
		});
		Student[] students = new Student[Constant.NUMBER_OF_STUDENT];
		IntStream.range(0, Constant.NUMBER_OF_STUDENT).forEach(i -> {
			students[i] = new Student(i, books);
			service.execute(students[i]);
		});

	}

}
