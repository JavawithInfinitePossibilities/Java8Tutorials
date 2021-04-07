/**
 * 
 */
package com.sid.java8.tutorials.Chapter20JavaReflection;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 */
public class JavaReflectionMain {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Class<Person> class1 = Person.class;
		System.out.println(class1.getName());
		try {
			Class<Person> person = (Class<Person>) Class
					.forName("com.sid.java8.tutorials.Chapter20JavaReflection.Person");
			System.out.println(person.getPackageName());
			Arrays.stream(person.getFields()).forEach((field) -> {
				System.out.println(field.getName() + "-" + field.getType());
			});
			System.out.println("+++++++++++++++++++++++++++");
			Arrays.stream(person.getMethods()).forEach((method) -> {
				System.out.println(method.getName());
			});
			System.out.println("+++++++++++++++++++++++++++");
			Arrays.stream(person.getDeclaredFields()).map((fielsAcc) -> {
				fielsAcc.setAccessible(true);
				return fielsAcc;
			}).forEach((field) -> {
				System.out.println(field.getName() + "-" + field.getType());
			});
			System.out.println("+++++++++++++++++++++++++++");
			Arrays.stream(person.getDeclaredMethods()).map((methodAcc) -> {
				methodAcc.setAccessible(true);
				return methodAcc;
			}).forEach((method) -> {
				System.out.println(method.getName());
			});
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println(person.getName());
			System.out.println(person.getSuperclass());
			System.out.println("+++++++++++++++++++++++++++");
			Arrays.stream(person.getInterfaces()).forEach((intf) -> {
				System.out.println(intf.getName());
			});
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
