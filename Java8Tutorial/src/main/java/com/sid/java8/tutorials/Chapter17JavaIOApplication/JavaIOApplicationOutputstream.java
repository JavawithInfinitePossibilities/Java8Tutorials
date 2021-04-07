/**
 * 
 */
package com.sid.java8.tutorials.Chapter17JavaIOApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Lenovo
 *
 */
public class JavaIOApplicationOutputstream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("src/main/resources/outputStream.txt");
				OutputStream fos = new FileOutputStream("src/main/resources/outputStream.txt");
				InputStream io = new FileInputStream("src/main/resources/Siddhant.txt")) {
			int counter = 0;
			char[] arrayOfChar = new char[io.available()];
			while (io.available() > 0) {
				arrayOfChar[counter++] = (char) io.read();
			}
			os.write(String.valueOf(arrayOfChar).getBytes());
			os.flush();
			os.close();
			System.out.println(String.valueOf(arrayOfChar));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
