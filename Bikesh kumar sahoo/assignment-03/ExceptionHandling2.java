//assignment-3 q-2
package com.exception;

import java.nio.channels.AlreadyBoundException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int div;
		
		try {
			int[] numbers = {10,0};
			int value1 = numbers[0];
			int value2 = numbers[3];
			div = value1/value2;
			System.out.println("Division is:"+div);
			
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			
		}catch(ArithmeticException arithmeticException) {
			System.out.println("Second element must be nonzero");
		}
	}

}
