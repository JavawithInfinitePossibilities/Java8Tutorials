/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

/**
 * @author Lenovo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child child = new Child();
		String s1 = "Siddhant";
		String s2 = "Siddhant";
		String s3 = new String(s2);
		System.out.println((s1 == s2) ? true : false);// true
		System.out.println((s1 == s3) ? true : false);// false
		System.out.println((s2 == s3) ? true : false);// false
		s3 = s3.intern();
		System.out.println((s2 == s3) ? true : false); // true
		Thread thread = new Thread(EmunExtendesThread.ONE);
		thread.start();
		ASimpleClass aSimpleClass = new ASimpleClass(1, "Sid");
		ASimpleClass simpleClass = new ASimpleClass(1, "Sid");
		System.out.println(aSimpleClass.hashCode());
		System.out.println(simpleClass.hashCode());
		if (aSimpleClass.equals(simpleClass)) {
			System.out.println("Yes");
		}
		Main main = new Main();
		String name = "Siddhant";
		main.myMethiod(name);
		System.out.println("Name : " + name);
		
		OverloadParentClass overloadParentClass=new OverrideChildClass();
		overloadParentClass.payment(123456789);
	}

	public void myMethiod(String myVariable) {
		myVariable = myVariable.concat("-Sahu");
		System.out.println("My Variable : " + myVariable);
		myVariable = new String("Welcome");
	}
}
