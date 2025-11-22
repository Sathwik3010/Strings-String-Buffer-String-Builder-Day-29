package com.codegnan.Strings;

import java.util.Scanner;

public class RemoveDuplicates28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<input.length();i++) {
			char current = input.charAt(i);
			
			if(result.indexOf(String.valueOf(current)) == -1) {
				result.append(current);
			}
		}
		
		System.out.println(result.toString());
		sc.close();
	}

}
