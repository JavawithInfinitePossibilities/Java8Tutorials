/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.forkjoin;

import java.util.concurrent.RecursiveAction;

/**
 * @author Lenovo
 *
 */
public class SimpleRecursiveAction extends RecursiveAction {
	private int simulatedWork;

	public SimpleRecursiveAction(int simulatedWork) {
		this.simulatedWork = simulatedWork;
	}

	@Override
	protected void compute() {
		if (simulatedWork > 50) {
			System.out.println("Parallel execution and split the tasks..." + simulatedWork);
			SimpleRecursiveAction simpleRecursiveAction1 = new SimpleRecursiveAction(simulatedWork / 2);
			SimpleRecursiveAction simpleRecursiveAction2 = new SimpleRecursiveAction(simulatedWork / 2);
			simpleRecursiveAction1.fork();
			simpleRecursiveAction2.fork();
		} else {
			System.out.println("No need for parallel execution, sequential is OK for this task..." + simulatedWork);
		}
	}

}
