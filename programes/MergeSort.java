package com.bridgelabz.programes;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int numberOfStrings = scanner.nextInt();
		String[] strings = new String[numberOfStrings];

		for (int i = 0; i < numberOfStrings; i++) {
			strings[i] = scanner.next();
		}
		scanner.close();

		Utility utility = new Utility();
		strings = utility.mergeSort(strings);

		System.out.println("Sorted list:");

		for (String string : strings) {
			System.out.println(string);
		}
	}
}