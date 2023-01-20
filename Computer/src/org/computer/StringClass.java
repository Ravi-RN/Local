package org.computer;

import java.util.Scanner;

public class StringClass {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the First string:");
	String a = in.nextLine();
	System.out.println("Enter the Second string:");
	String b = in.nextLine();
	int length = a.length();
	System.out.println("Length Is:"+length);
	char charAt = a.charAt(2);
	System.out.println(charAt);
	
	int indexOf = a.indexOf(' ');
	System.out.println(indexOf);
	boolean equals = a.equals(b);
	System.out.println(equals);
	boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
	System.out.println(equalsIgnoreCase);
	//boolean contains = a.contains("@");
	
}
}
