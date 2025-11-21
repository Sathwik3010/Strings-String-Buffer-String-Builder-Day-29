package com.codegnan.Strings;

import java.util.Scanner;

public class StringPalindromCheck {

	public static boolean isPalindrom(String str) {
		str = str.replace(" ", "").toLowerCase();
		int left =0;
		int right = str.length()-1;
		
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		boolean result = isPalindrom(str);
		if(result) {
			System.out.println(str+" Is a Palindrom");
		} else {
			System.out.println(str+" Is not a Palindrom");
		}
		sc.close();
	}

}
