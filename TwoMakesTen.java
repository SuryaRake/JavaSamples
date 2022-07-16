package test;

import java.util.Scanner;

public class TwoMakesTen {

	public static void main(String[] args) {
		/* Create a function that takes two arguments. Both arguments are integers, a and b. 
		 * Return true if one of them is 10 or if their sum is 10. */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide the numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = num1+num2;
		if ((num1==10)|| (num2==10) || (sum == 10)) {
			System.out.println("One among the given number or their sum is 10");
		}
		else {
			System.out.println("None of these numbers or their sum is 10");
		}
	}

}
