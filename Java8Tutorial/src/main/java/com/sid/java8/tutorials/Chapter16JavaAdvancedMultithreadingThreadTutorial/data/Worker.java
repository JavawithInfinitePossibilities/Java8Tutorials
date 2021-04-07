/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class Worker {

	private int limit;
	private int count;
	private int condition;

	/**
	 * @param limit
	 * @param count
	 */
	public Worker(int limit, int count) {
		super();
		this.limit = limit;
		this.count = count;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public boolean isCheck() {
		return count == limit;
	}

	public void increment() {
		count++;
	}

	public void print(String threadName) {
		System.out.println(threadName + " : Count :" + count);
	}
}
