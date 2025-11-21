package com.codegnan.Strings;

import java.util.Scanner;

public class StringPrefix18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			String Original = sc.nextLine();
			String prefix = sc.nextLine();
			
			StringBuffer sb = new StringBuffer();
			sb.append(prefix);
			sb.append(Original);

			System.out.println(sb);
		sc.close();
	}

}
