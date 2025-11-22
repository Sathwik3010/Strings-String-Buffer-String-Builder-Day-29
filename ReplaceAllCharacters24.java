package com.codegnan.Strings;

import java.util.Scanner;

public class ReplaceAllCharacters24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char oldChar = sc.nextLine().charAt(0);
		char newChar = sc.nextLine().charAt(0);

		StringBuilder sb = new StringBuilder(input);
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i) == oldChar) {
				sb.setCharAt(i, newChar);
			}
		}
		
		System.out.println(sb);
		sc.close();
	}

}
