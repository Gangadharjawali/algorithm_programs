package com.bridgelabz.programes;

import java.io.*;
import java.util.*;

import com.bridgelabz.utility.Utility;

public class BSWordFromWL {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String source = "/home/bridgeit/gangadhar/Java/algorithm_pgm/file.txt";
		Utility utility = new Utility();
		String temp = "";
		try {
			FileReader fr = new FileReader(source);
			BufferedReader br = new BufferedReader(fr);
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
				int length = utility.WordLength(temp);
				System.out.println("enter the string to search");
				String key = sc.nextLine();
				int result = utility.binarySearchWordFromWordList(temp, length, key);
				if (result == -1) {
					System.out.println("String not found ");
				} else {
					System.out.println("String found at " + result);
				}
			}
		} catch (Exception e) {
			System.out.println("File not found ");
		}
	}

}