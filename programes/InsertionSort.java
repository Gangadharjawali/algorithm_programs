package com.bridgelabz.programes;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Utility u = new Utility();
		System.out.println("Enter the String : ");
		String string = sc.nextLine();
		System.out.println();
		String str[] = string.split(" ");
		String strArray[] = u.sortArrayString(str);

		System.out.println("Sorted words in the String array ");
		System.out.println();
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

}
