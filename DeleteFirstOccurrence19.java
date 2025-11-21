package com.codegnan.Strings;

import java.util.Scanner;

public class DeleteFirstOccurrence19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        String input = sc.nextLine();      
        String sub = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);
        
        int index = sb.indexOf(sub);
        
        if(index != -1) {
        	sb.delete(index, index+sub.length());
        }
        
        System.out.println(sb);
		sc.close();
	}

}
