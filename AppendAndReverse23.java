package com.codegnan.Strings;

import java.util.Scanner;

public class AppendAndReverse23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(first);
		sb.append(second);
		
		sb.reverse();
		System.out.println(sb);
		sc.close();
	}

}
