package com.bridgelabz.programes;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class FindYourNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		//int n=Integer.parseInt(args[0]);
		System.out.println("enter the size");
		int n=sc.nextInt();
		utility.findYourNumber(n);
		
		
	}

}
