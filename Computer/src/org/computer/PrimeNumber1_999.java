package org.computer;

import java.util.Scanner;

public class PrimeNumber1_999 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=0;
		for (int i = 1; i <=999; i++) {
			for (int j = 1; j <=i; j++) {
				if (i%j==0) {
					a++;
					}
				
			}
			if (a==2) {
				System.out.println(i+"is prime number");
			}
			a=0;
		}
		
	}

}
