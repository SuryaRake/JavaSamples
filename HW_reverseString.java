package test;

import java.util.Scanner;

public class HW_reverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to display reverse");
		String str = scanner.nextLine();
		String[] strArray = str.split(" ");
		
		
		for(int i=(strArray.length-1); i>=0; --i) {
			System.out.println(strArray[i]);
		}
				
		

	}

}
