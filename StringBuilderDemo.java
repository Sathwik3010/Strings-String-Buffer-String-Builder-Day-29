package com.codegnan.Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Potti Dev Sathwik");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println();
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("Potti Dev Sathwik");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
	}

}
