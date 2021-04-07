/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class ShutdownHook {

	private volatile boolean flag;

	/**
	 * @param flag
	 */
	public ShutdownHook(boolean flag) {
		super();
		this.flag = flag;
	}

	public final boolean isFlag() {
		return flag;
	}

	public final void setFlag(boolean flag) {
		this.flag = flag;
	}

}
