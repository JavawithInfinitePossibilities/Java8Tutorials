/**
 * 
 */
package com.sid.java8.tutorials.Chapter04AnonymousInnerClassesLambdaExpressions;

import com.sid.java8.tutorials.Chapter03LambdaExpressionsWithCollections.intf.IAnonymousInterface;

/**
 * @author Lenovo
 *
 */
public class Section022AnonymousInnerClassVsLambdaExpressionPar3 {
	public int x = 888;

	public void method2Concrete() {
		IAnonymousInterface iAnonymousInterface = new IAnonymousInterface() {
			int x = 999;

			@Override
			public void method1Abstract() {
				System.out.println(Section022AnonymousInnerClassVsLambdaExpressionPar3.this.x);
				System.out.println(this.x);
			}
		};
		iAnonymousInterface.method1Abstract();
	}
	
	public void method3ConcreteLambda() {
		int y = 999;
		IAnonymousInterface iAnonymousInterface =()->{
			int x = 999;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(y);
			this.x=1000;
			//y=1100;
			System.out.println(this.x);
		};
		iAnonymousInterface.method1Abstract();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Section022AnonymousInnerClassVsLambdaExpressionPar3 par3 = new Section022AnonymousInnerClassVsLambdaExpressionPar3();
		par3.method2Concrete();
		par3.method3ConcreteLambda();
		//Section025DifferencesBetweenInterfaceWithDefaultMethodsAndAbstractClasses.staticMethod();
	}

}
