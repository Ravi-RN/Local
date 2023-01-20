package org.computer;

import java.util.Scanner;

public class FactorNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = in.nextInt();
		int b=0;
		for (int i = 1; i <=a; i++) {
			if (a%i==0) {
				//System.out.println("The Factor Is:"+i);
				b++;
			}
			
				} 
		if (b==2) {
			System.out.println("It is Prime Number");
		} else {
			System.out.println("It Is Not a Prime Number");
		}
		}
	}


