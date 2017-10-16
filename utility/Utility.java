package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Anagrames of two string
	 * 
	 * @param s1
	 * @param s2
	 */
	public void anagrames(String s1, String s2) {
		s1 = s1.replaceAll("\\s", " ");
		s2 = s2.replaceAll("\\s", " ");
		if (s1.length() != s2.length()) {
			System.out.println("two strings are not anagrames");
		} else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			char arr1[] = s1.toCharArray();
			char arr2[] = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean status = Arrays.equals(arr1, arr2);
			if (status == true) {
				System.out.println("two strings are anagrames");
			} else {

				System.out.println("two strings are not anagrames");
			}
		}
		// TODO Auto-generated method stub

	}

	public void palindromeAnagram(int size) {
		int i, j;
		for (i = 1; i < size; i++) {
			boolean flag = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				int rem, num = i, sum = 0;
				while (num > 0) {
					rem = num % 10;
					sum = (sum * 10) + rem;
					num = num / 10;
				}
				if (sum == i) {
					System.out.println(i);
				}
			}
		}
		// TODO Auto-generated method stub

	}

	/**
	 * Find your number
	 * 
	 * @param size
	 */
	public void findYourNumber(int size) {
		int low = 0, high = size - 1;
		int mid, a;
		while (true) {
			mid = (high + low) / 2;
			System.out.println("the number between " + low + " and " + mid + " pess 1 else 0");
			a = sc.nextInt();
			if (a == 1) {
				low = low;
				high = mid;
			} else {
				low = mid + 1;
				high = high;
			}
			if (low == high) {
				System.out.println("the number is" + low);
				System.exit(0);
			}
		}
		// TODO Auto-generated method stub

	}

	/**
	 * Find the length of the word
	 * 
	 * @param temp
	 * @return
	 */
	public int WordLength(String temp) {
		int n = 0;
		StringTokenizer str = new StringTokenizer(temp, ",");
		while (str.hasMoreTokens()) {
			String token = str.nextToken();
			n++;
		}
		return n;
		// TODO Auto-generated method stub

	}

	/**
	 * Binary Search the word from the Word list
	 * 
	 * @param temp
	 * @param length
	 * @param key
	 * @return
	 */
	public int binarySearchWordFromWordList(String temp, int length, String key) {
		String arr[] = new String[length];
		int i = 0;
		StringTokenizer str = new StringTokenizer(temp, ",");
		while (str.hasMoreTokens()) {
			String token = str.nextToken();
			arr[i] = token;
			i++;
		}
		for (i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					String dummy = arr[i];
					arr[i] = arr[j];
					arr[j] = dummy;
				}
			}
		}
		System.out.println("sorting of words are ");
		for (i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int low = 0, high = length - 1;
		int mid;
		while (low <= high) {
			mid = (high + low) / 2;

			if (key.compareToIgnoreCase(arr[mid]) == 0) {
				return mid;
			} else if (key.compareToIgnoreCase(arr[mid]) > 0) {
				low = mid + 1;
				high = high;
			} else if (key.compareToIgnoreCase(arr[mid]) < 0) {
				low = low;
				high = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Bubble Sort
	 * 
	 * @param size
	 */
	public void bubbleSort(int size) {
		int arr[] = new int[size];
		int i;
		System.out.println("enter the numbers");
		for (i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		int m = size - 1;
		while (m > 0) {
			for (i = 0; i < m; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			m--;
		}
		System.out.println("the sorted numbers are");
		for (i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		// TODO Auto-generated method stub

	}

	/**
	 * Vending machine
	 * @param n
	 * @param notes
	 * @param i
	 * @param totalNotes
	 */
	public void count_notes(int money, int[] notes, int i, int totalNotes) {
		int count = 0;
		if (money == 0) {
			System.out.println("Total number of notes :" + totalNotes);
			System.exit(0);
		} else {
			count = money / notes[i];
			totalNotes = totalNotes + count;
			System.out.println(notes[i] + "Rs notes are  " + count);
			money = money % notes[i];
			i++;
		}
		count_notes(money, notes, i, totalNotes);
		// TODO Auto-generated method stub

	}

	/**
	 * Day of Week
	 * 
	 * @param d
	 * @param m
	 * @param y
	 */
	public void dayOfWeek(int d, int m, int y) {
		if (m > 0 && m < 13) {

			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (d < 1 || d > 31) {
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			if (m == 4 || m == 6 || m == 9 || m == 11) {
				if (d < 1 || d > 30) {
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			if (m == 2) {
				if (d < 1 || d > 29) {
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}

			if (m == 2 && y % 4 != 0) {
				if (d == 29) {
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}
			int y1 = y - (14 - m) / 12;
			int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
			int m1 = m + 12 * ((14 - m) / 12) - 2;
			int d1 = (d + x + (31 * m1) / 12) % 7;
			String days[] = new String[7];
			days[0] = "sunday";
			days[1] = "monday";
			days[2] = "tuesday";
			days[3] = "wednesday";
			days[4] = "thursday";
			days[5] = "friday";
			days[6] = "saturday";
			System.out.println("the day on " + m + "/" + d + "/" + y + " is " + days[d1] + " .");
		} else {
			System.out.println("month is out of range");
		}
		// TODO Auto-generated method stub

	}

	/**
	 * Temprature Convertion
	 * @param n
	 * @param value
	 * @return
	 */
	public double temperaturConversion(int n, float value) {
		double ans;
		if (n == 0) {
			value = value + 32;
			ans = 1.8 * value;
			return ans;
		}
		if (n == 1) {
			value = value - 32;
			ans = value * 0.5556;
			return ans;
		}
		return 0;
	}

	/**
	 * Payment
	 * @param y
	 * @param p
	 * @param r
	 */
	public void payment(int y, int p, Float r) {
		int n = 12 * y;
		float i = r / (12 * 100);
		double pow = Math.pow((1 + i), (-n));
		double payment = p * i / (1 - pow);

		// System.out.println("My monthly payments will be " + payment);
		// System.out.println("Total Interest Paid is " + intetotal);
		System.out.println("Total amount paid is " + payment);
		// TODO Auto-generated method stub

	}

	/**
	 * Square root of the number
	 * @param num
	 * @return
	 */
	public double square(double num) {
		double t = num;
		double Epsilon = 1E-15;
		while ((Math.abs(t - num / t)) > (Epsilon * t)) {
			t = (t + (num / t)) / 2;
		}
		return t;
	}

	/**
	 * To binary
	 * @param num
	 */
	public void toBinary(int num) {
		String temp = (String.format("%16s", Integer.toBinaryString(num)).replace(" ", "0"));
		System.out.println("binary formate : " + temp);
		char arr[] = temp.toCharArray();
		int i, sum = 0;
		int j = 15;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				int pow = (int) Math.pow(2, j);
				// sum=sum+pow;
				System.out.print(pow + "\t");
			}
			j--;
		}
		/*
		 * if(num==sum){ System.out.println("It is power of 2"); }else{
		 * System.out.println("It is not power of 2"); }
		 */

	}

	/**
	 * Insertion Sort
	 * @param strings
	 * @return
	 */
	public String[] sortArrayString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - 1; j++) {
				if (strings[j].compareTo(strings[j + 1]) > 0) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				}
			}
		}
		return strings;
	}

	/**
	 * Merge Sort
	 * @param array
	 * @return
	 */
	public String[] mergeSort(String[] array) {
		if (array.length == 1) {
			return array;
		}
		String first[] = new String[array.length / 2];
		String last[] = new String[array.length - (array.length / 2)];
		for (int i = 0; i < first.length; i++) {
			first[i] = array[i];
		}
		int j = 0;
		for (int i = first.length; i < array.length; i++) {
			last[j] = array[i];
			j++;
		}
		first = mergeSort(first);
		last = mergeSort(last);

		String[] returnArray = new String[array.length];
		int firstPos = 0, lastPos = 0;
		for (int i = 0; i < returnArray.length; i++) {
			if (lastPos == last.length) {
				returnArray[i] = first[firstPos];
				firstPos++;
			} else if (firstPos == first.length) {
				returnArray[i] = last[lastPos];
				lastPos++;
			} else if (first[firstPos].compareTo(last[lastPos]) > 0) {
				returnArray[i] = last[lastPos];
				lastPos++;
			} else {
				returnArray[i] = first[firstPos];
				firstPos++;
			}
		}
		return returnArray;
	}

	/**
	 * Swap Binary nibbles
	 * @param num
	 */
	public void swapBinaryNibbles(int num) {
		String temp=(String.format("%8s",Integer.toBinaryString(num)).replace(" ", "0"));
		//char arr[]=temp.toCharArray();
		char[] m=new char[8];
		m=temp.toCharArray();
		char[] n=new char[8];
		int i,j=0;
		for (i =4 ; i<8 ; i++) {
			n[j]=m[i];
			j++;
		}
		for(i=0;i<4;i++)
		{
			n[j]=m[i];
			j++;
		}
	
		for (i =0 ; i<8 ; i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("swaped nibbles are");		
		for(i=0;i<8;i++)
		{
			System.out.print(n[i]+" ");
		}
		
		System.out.println();
		int pow=0;
		j=7;
		for (i =0 ; i<8 ; i++) {
			if(n[i]=='1')
			{
				pow +=(int)Math.pow(2, j);
				
			}  
			
			j--;
		}
		System.out.print(pow+" ");
		i=1;
		while(i<pow)
		{
			i=i*2;
		}
		if(i==pow)
		{
			System.out.println("number is power of two");
		}
		else {
			System.out.println("number is not a power of two");
		}
		// TODO Auto-generated method stub
		
	}

}
