/**
 * 
 */
package com.sid.java8.tutorials.Chapter12MethodandConstructorReferenceByusingOperator.Section077MethodReferenceByDoubleColonOperator;

import com.sid.java8.tutorials.Chapter12MethodandConstructorReferenceByusingOperator.IConstructorRef;
import com.sid.java8.tutorials.Chapter12MethodandConstructorReferenceByusingOperator.Sample;

/**
 * @author Lenovo
 *
 */
public class Section077MethodReferenceByDoubleColonOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IMethodReference reference = MethodReferClass::methodReference;
		reference.methodReference();
		MethodReferClassInstance methodReferClass = new MethodReferClassInstance();
		IMethodReferenceInstance instReference = methodReferClass::methodRefInstance;
		instReference.methodReference("Siddhant");
		IConstructorRef iConstructorRef=Sample::new;	
		System.out.println("***********");
		Sample sample=iConstructorRef.get();


	}

}
