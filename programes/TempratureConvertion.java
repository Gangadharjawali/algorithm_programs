package com.bridgelabz.programes;
import java.util.*;

import com.bridgelabz.utility.Utility;
class TempratureConvertion
{

	public static void main(String []args)
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		int n;
		float value;
		double ans;
		System.out.println("0 to convert celsius to fahrenheit ");
		System.out.println("1 to convert fahrenheit to celsius");
		n=sc.nextInt();
		switch(n)
		{
			case 0: System.out.println("enter the celsius value ");
					value=sc.nextInt();
					ans=utility.temperaturConversion(n,value);
					System.out.println("the fahrenheit value is "+ans+" .");
					break;
			case 1: System.out.println("enter the fahrenheit value ");
					value=sc.nextInt();
					ans=utility.temperaturConversion(n,value);
					System.out.println("the Celsius value is "+ans+" .");
					break;
			default : System.out.println("you entered a invalid number");
				break;
		}
		
	}
}