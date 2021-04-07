/**
 * 
 */
package com.sid.java8.tutorials.Chapter17JavaIOApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Lenovo
 *
 */
public class JavaIOApplicationInputstream {
	public static void main(String[] args) {
		try (InputStream io = new FileInputStream(new File("src/main/resources/Siddhant.txt"))) {
			int i;
			int counter = 0;
			char[] arrayOfChar = new char[io.available()];
			while ((i = io.read()) != -1) {
				arrayOfChar[counter++] = (char) i;
			}
			System.out.println(String.valueOf(arrayOfChar));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
