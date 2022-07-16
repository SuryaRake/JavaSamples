package test;

import java.util.Scanner;

public class HW_printArray {

	public static void main(String[] args) {
		//h.w: Printing entire array using normal for loop.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the numbers to be added to the array");
		//int arr = scanner.nextInt();
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("The content of the array is " );
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
		
		
		
				// hw: Reverse the string

	}

}
