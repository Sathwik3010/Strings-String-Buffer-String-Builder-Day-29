package com.codegnan.Strings;

import java.util.Scanner;

public class StirngSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = sc.next();
		System.out.println("Enter second String");
		String str2 = sc.next();

		System.out.println("Before Swapping: "+ str1 + " " + str2);
		str1 = str1 + str2;
		
		str2 = str1.substring(0, str1.length() - str2.length());//-4
		
		str1 = str1.substring(str2.length());
		System.out.println("After Swapping: "+ str1 + " " + str2);

		sc.close();
	}

}
