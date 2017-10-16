package com.bridgelabz.programes;
import java.util.*;

import com.bridgelabz.utility.Utility;
class DayOfWeek
{
	public static void main(String []args)
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		int d=sc.nextInt();
		System.out.println("Enter the month in Integer format");
		int m=sc.nextInt();
		System.out.println("Enter the year");
		int y=sc.nextInt();
		utility.dayOfWeek(d,m,y);
	
	}
}