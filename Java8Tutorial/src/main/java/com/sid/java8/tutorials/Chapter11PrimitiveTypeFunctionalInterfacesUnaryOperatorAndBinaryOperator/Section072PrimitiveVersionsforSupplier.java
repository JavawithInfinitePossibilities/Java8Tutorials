package com.sid.java8.tutorials.Chapter11PrimitiveTypeFunctionalInterfacesUnaryOperatorAndBinaryOperator;

import java.util.function.IntSupplier;

/**
 * @author Lenovo
 *
 */
public class Section072PrimitiveVersionsforSupplier {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			return (int) (Math.random() * 5);
		};
		System.out.println(intSupplier.getAsInt());
	}
}
