package org.computer;

import java.util.Scanner;

public class PattenUsingLoop {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int a = in.nextInt();
		for (int i = 1; i <=a ; i++) {
			for (int j = a-i; j > 1; j--) {
				System.out.print(" ");
				
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(" * ");
			}
			
			System.out.println();	

}
	}
}
