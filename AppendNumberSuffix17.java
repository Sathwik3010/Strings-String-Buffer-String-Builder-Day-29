package com.codegnan.Strings;

import java.util.Scanner;

public class AppendNumberSuffix17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String base = sc.nextLine();
		int number = sc.nextInt();
		sc.nextLine();
		String suffix = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(base);
		sb.append(number);
		sb.append(suffix);
		
		System.out.println(sb);
		sc.close();
	}
}
