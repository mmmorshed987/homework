package one2tencoding;

import java.util.Scanner;

public class Coding11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);			// input or in or Scanner ???
		
		System.out.println ( " please enter first number :");
		int number1 = scanner.nextInt();
		
		System.out.println ( " please enter last number  :");
		int number2	= scanner.nextInt();
		
		int sum				= number1 + number2 ;
		int minus			= number1 - number2 ;
		int multiply		= number1 * number2 ;
		int divide			= number1 / number2 ;
		int Remainder  		= number1 % number2 ;
		
		  System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, divide, Remainder);

		
		
		
		

	}

}
