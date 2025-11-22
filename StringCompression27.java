package com.codegnan.Strings;

import java.util.Scanner;

public class StringCompression27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();

	        StringBuilder compressed = new StringBuilder();

	        int count = 1;

	        for (int i = 1; i <= str.length(); i++) {
	            // If same character, increment count
	            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
	                count++;
	            } else {
	                // Append character and its count
	                compressed.append(str.charAt(i - 1)).append(count);
	                count = 1;
	            }
	        }

	        // Decide which string to print
	        if (compressed.length() > str.length()) {
	            System.out.println(str);
	        } else {
	            System.out.println(compressed.toString());
	        }

	        sc.close();
	}

}
