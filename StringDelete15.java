package com.codegnan.Strings;

import java.util.Scanner;

public class StringDelete15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
        StringBuffer sb = new StringBuffer(input);
        
        sb.delete(start, end);
        System.out.println(sb);
		sc.close();
	}

}
