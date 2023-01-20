package org.computer;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = in.nextInt();
		int b,c,d,temp,ams;
		temp=a;
		b=temp%10;
		temp=temp/10;
		c=temp%10;
		temp=temp/10;
		d=temp%10;
		ams=b*b*b+c*c*c+d*d*d;
	if (ams==a) {
		System.out.println("It is Amstrong");
		
	} else {
		System.out.println("not a amstrong");
	}	
	}

}
