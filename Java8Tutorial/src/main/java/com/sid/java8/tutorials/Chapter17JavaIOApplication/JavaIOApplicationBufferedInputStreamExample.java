/**
 * 
 */
package com.sid.java8.tutorials.Chapter17JavaIOApplication;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Lenovo
 *
 */
public class JavaIOApplicationBufferedInputStreamExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("src/main/resources/Siddhant.txt"))) {
			int count = 0;
			char[] charArray = new char[bis.available()];
			while (bis.available() > 0) {
				charArray[count++] = (char) bis.read();
			}
			System.out.println(String.valueOf(charArray));
		}
	}

}
