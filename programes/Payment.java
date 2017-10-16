package com.bridgelabz.programes;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class Payment {
	
	public static void main(String args[])
	{
		//int y=Integer.parseInt(args[0]);
		//int p=Integer.parseInt(args[1]);
		//float r=Float.parseFloat(args[2]);
		Utility utility=new Utility();
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the principal amount ");
	    int p = sc.nextInt();
	    System.out.println("interest rate ");
	    Float r = sc.nextFloat();
	    System.out.println("How many years");
	    int y = sc.nextInt();
		utility.payment(y,p,r);
	}
	
}
