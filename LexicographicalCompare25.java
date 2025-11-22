package com.codegnan.Strings;

import java.util.Scanner;

public class LexicographicalCompare25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int result = s1.compareTo(s2);
		
		if(result<0) {
			System.out.println(-1);
		} else if(result == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		sc.close();
	}

}
