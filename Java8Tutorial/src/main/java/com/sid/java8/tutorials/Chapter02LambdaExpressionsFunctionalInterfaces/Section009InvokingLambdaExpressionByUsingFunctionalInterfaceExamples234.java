/**
 * 
 */
package com.sid.java8.tutorials.Chapter02LambdaExpressionsFunctionalInterfaces;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.sid.java8.tutorials.Chapter02LambdaExpressionsFunctionalInterfaces.intf.IAdd2number;
import com.sid.java8.tutorials.Chapter02LambdaExpressionsFunctionalInterfaces.intf.IGetStringLength;
import com.sid.java8.tutorials.Chapter02LambdaExpressionsFunctionalInterfaces.intf.ISquare;

/**
 * @author Lenovo
 *
 */
public class Section009InvokingLambdaExpressionByUsingFunctionalInterfaceExamples234 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		IAdd2number iAdd2number = (int a, int b) -> {
			System.out.println("Adding 2 number Num1: " + a + " Num2: " + b + " addition : " + (a + b));
		};
		iAdd2number.add2Numbers(50, 100);
		iAdd2number.add2Numbers(45, 58);

		IGetStringLength iGetStringLength = (String name) -> {
			return name.length();
		};
		int lengthOfName = iGetStringLength.getStringLength("Siddhant");
		System.out.println("Length : " + lengthOfName);

		ISquare iSquare = (x) -> {
			return x * x;
		};
		System.out.println("Square of value x :" + iSquare.getSquareOf(5));

		Callable<Integer> myCallableThread = () -> {
			return 10;
		};
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> submit = executor.submit(myCallableThread);
		System.out.println("My callable thread value : " + submit.get());
		executor.shutdown();
	}
}
