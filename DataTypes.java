package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to perform calculation");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = num1+num2;
		int mul = num1*num2;
		int diff = num1-num2;
		float div = (float)num1/num2;
		
		System.out.println("The sum of given numbers is "+sum);
		System.out.println("The product of given numbers is "+mul);
		System.out.println("The difference of given numbers is "+diff);
		if(num2 != 0) {
			System.out.println("The quotient of given numbers is "+div);
		}
		else {
			System.out.println("Divison with 0 is not defined");
		}
		
				

	}

}
