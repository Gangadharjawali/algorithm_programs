package com.bridgelabz.programes;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class Sqrt {
	public static void main(String args[]) {
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double num=sc.nextDouble();
		if(num<=0)
		{
			System.out.println("try another number");
			System.exit(0);
			
		}
		double value=utility.square(num);
		System.out.println(value);
	}

}
