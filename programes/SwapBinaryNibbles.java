package com.bridgelabz.programes;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class SwapBinaryNibbles {
	public static void main(String args[])
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int num=sc.nextInt();
		utility.swapBinaryNibbles(num);
	
	}
}
