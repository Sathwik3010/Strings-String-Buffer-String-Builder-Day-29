package com.codegnan.Strings;

import java.util.Scanner;

public class DeleteFirstChar21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(input);
		
		if(sb.length() > 0) {
			sb.deleteCharAt(0);
		}
		
		System.out.println(sb);
		sc.close();
	}

}
