/**
 * 
 */
package com.sid.java8.tutorials;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Lenovo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Stream.of("green", "yellow", "blue").max((s1, s2) -> s1.compareTo(s2))
				.filter(s -> s.endsWith("n")).orElse("y"));
		a a = new a();
		a.b d=a.new b();
		LocalDate l=LocalDate.of(2015, 4, 4);
		System.out.println(l.format(DateTimeFormatter.ofPattern("MMM dd,yyyy")));
		System.out.println(l.format(DateTimeFormatter.ofPattern("E, MMM dd,yyyy")));
		System.out.println(l.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
		List<Integer> name=new ArrayList<Integer>();
		name.add(1);
		name.add(2);
		name.add(0,3);
		name.add(1, 4);
		System.out.println(name);
	}

}

class a {
	public int c;
	class b {
		private int s;
	}
}
