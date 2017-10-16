package com.bridgelabz.programes;
import java.util.*;

import com.bridgelabz.utility.Utility;
class VendingMachine
{
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount");
		int N=scan.nextInt();	
		int Notes[]={1000,500,100,50,10,5,2,1};
		int i=0;
		int TotalNotes=0;
		utility.count_notes(N,Notes,i,TotalNotes);
	}
}	