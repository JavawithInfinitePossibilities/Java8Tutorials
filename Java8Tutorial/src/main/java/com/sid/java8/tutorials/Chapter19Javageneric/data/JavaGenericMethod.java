/**
 * 
 */
package com.sid.java8.tutorials.Chapter19Javageneric.data;

import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class JavaGenericMethod {

	public <T> void genericMethod(T t) {
		System.out.println("This is my generic method : " + t.toString());
	}

	public <T> T genericMethodWithReturnType(T t) {
		System.out.println("This is my generic method : " + t.toString());
		return t;
	}

	public <T> void genericMethodWithArray(T[] t) {
		System.out.println("This is my generic method : " + t.toString());
		Arrays.asList(t).stream().forEach((tArrayValue) -> {
			System.out.println(tArrayValue);
		});
	}

	public <T extends Comparable<T>> T genericMethodWithBoundry(T t1, T t2) {
		if (t1.compareTo(t2) < 0) {
			return t1;
		}
		return t2;
	}

	public <T> List<T> genericMethodWithBoundryCondition(T t1, List<T> t2) {
		t2.add(t1);
		return t2;
	}
}
