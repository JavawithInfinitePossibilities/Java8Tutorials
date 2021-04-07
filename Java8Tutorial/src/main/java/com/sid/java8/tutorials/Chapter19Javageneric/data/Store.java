/**
 * 
 */
package com.sid.java8.tutorials.Chapter19Javageneric.data;

/**
 * @author Lenovo
 *
 */
public class Store<T> {
	private T item;

	/**
	 * @return the item
	 */
	public T getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Store [item=" + item.toString() + "]";
	}

}
