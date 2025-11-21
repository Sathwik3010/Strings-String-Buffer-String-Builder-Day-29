package com.codegnan.Strings;

import java.util.Scanner;

public class StringInsert14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String base = sc.nextLine();
		int index = sc.nextInt();
		sc.nextLine();
		String insertStr = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(base);
		sb.insert(index,insertStr);
		System.out.println(sb);
		sc.close();
	}

}
