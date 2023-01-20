package org.computer;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Number");
	int a = in.nextInt();
	int rev=0,rem;
	while (a!=0) {
		rem=a%10;
		rev=rev*10+rem;
		a/=10;
			}
	System.out.println(rev);
	}
}
