/**
 * 
 */
package com.sid.java8.tutorials.Chapter11PrimitiveTypeFunctionalInterfacesUnaryOperatorAndBinaryOperator;

import java.util.function.IntConsumer;

import com.sid.java8.tutorials.Chapter11PrimitiveTypeFunctionalInterfacesUnaryOperatorAndBinaryOperator.data.DummyDataTable;

/**
 * @author Lenovo
 *
 */
public class Section071PrimitiveVersionsforConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArrayData = DummyDataTable.intArrayData();
		IntConsumer intConsumer = (int i) -> {
			System.out.println(" intConsumer : " + i);
		};
		for (int j : intArrayData) {
			intConsumer.accept(j);
		}
	}

}
