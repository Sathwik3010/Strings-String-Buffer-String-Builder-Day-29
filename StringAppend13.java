package com.codegnan.Strings;

import java.util.Scanner;

public class StringAppend13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(first);
		sb.append(second);
		
		System.out.println(sb);
		sc.close();
	}

}
