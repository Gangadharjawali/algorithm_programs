package com.bridgelabz.programes;

import java.util.*;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	public static void main(String args[]) {
		Utility utility = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		utility.bubbleSort(n);

	}

}
