/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

/**
 * @author Lenovo
 *
 */
public class OverloadParentClass {

	public void payment(String bankaccount) {
		System.out.println("Payment by bank account.");
	}

	public void payment(int creditcard) {
		System.out.println("Payment by credit card.");
	}

}
