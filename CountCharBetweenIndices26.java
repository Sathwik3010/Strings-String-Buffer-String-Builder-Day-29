package com.codegnan.Strings;

import java.util.Scanner;

public class CountCharBetweenIndices26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();   // string
	        char ch = sc.next().charAt(0);  // character to count
	        int start = sc.nextInt();       // start index
	        int end = sc.nextInt(); 
	        
	        int count = 0;
	        
	        for(int i=start;i<end && i<input.length();i++) {
	        	if(input.charAt(i)==ch)
	        		count++;
	        }
	        
	        System.out.println(count);
	        sc.close();
	}

}
