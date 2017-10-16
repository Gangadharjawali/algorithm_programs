package com.bridgelabz.programes;

import java.util.*;

import com.bridgelabz.utility.Utility;

public class Anagrames {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string one");
		String s1 = sc.nextLine();
		System.out.println("enter the string two");
		String s2 = sc.nextLine();
		Utility u = new Utility();
		u.anagrames(s1, s2);

	}

}
