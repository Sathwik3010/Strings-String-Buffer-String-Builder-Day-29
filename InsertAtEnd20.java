package com.codegnan.Strings;

import java.util.Scanner;

public class InsertAtEnd20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String base = sc.nextLine();
		String toInsert = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(base);
		
		sb.insert(base.length(), toInsert);
		
		System.out.println(sb);
		sc.close();
	}

}
