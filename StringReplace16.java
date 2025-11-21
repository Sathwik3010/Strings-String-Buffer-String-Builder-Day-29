package com.codegnan.Strings;

import java.util.Scanner;

public class StringReplace16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.nextLine();
		String replacement = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(input);
		sb.replace(start, end, replacement);
		
		System.out.println(sb);
		sc.close();
	}

}
