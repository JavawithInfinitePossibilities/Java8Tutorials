/**
 * 
 */
package com.sid.java8.tutorials.Chapter18JavaCollection.List;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

/**
 * @author Lenovo
 *
 */
public class JavaCollectionVectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		vector.addElement(5);
		vector.addElement(6);

		System.out.println("Vector :" + vector);
		vector.removeElement(2);
		System.out.println("After removing one element :" + vector);
		System.out.println("Capacity will represent how much element can vector can contain :" + vector.capacity());
		System.out.println("Size will represent how many element present in Vector :" + vector.size());

		System.out.println("Enumeration");
		/**
		 * Enumeration is a read only cursor. We can't do any remove operation.<br/>
		 * This is not supporting ArrayList or LinkedList.
		 */
		Enumeration<Integer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Integer integer = (Integer) elements.nextElement();
			System.out.println(integer);
		}

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		System.out.println("Stack :" + stack);
		stack.pop();
		System.out.println("After removing one element from top :" + stack);
		System.out.println("Using peek method: " + stack.peek());
		System.out.println(stack);

		Stack<String> myStack = new Stack<String>();
		myStack.push("Siddhant");
		myStack.push("Sahu");
		myStack.push("Kunmun");
		System.out.println(myStack);
		System.out.println(myStack.peek());
	}

}
