package com.bridgelabz.programes;
import java.util.*;

import com.bridgelabz.utility.Utility;
class PrimePalindrome
{
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size;
		size=sc.nextInt();
		utility.palindromeAnagram(size);
		
	}
}