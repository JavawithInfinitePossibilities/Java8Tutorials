/**
 * 
 */
package com.sid.java8.tutorials.Chapter19Javageneric.data;

/**
 * @author Lenovo
 *
 */
public class CustomHashTable<K, V> {
	private K key;
	private V value;

	/**
	 * @param key
	 * @param value
	 */
	public CustomHashTable(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "CustomHashTable [key=" + key.toString() + ", value=" + value.toString() + "]";
	}

}
