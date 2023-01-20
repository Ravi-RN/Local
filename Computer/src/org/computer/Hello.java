package org.computer;

import java.util.Scanner;

public class Hello {
 public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter the No of Subject:");
	 int a = in.nextInt();
	 int sum=0,b, avg;
	 for (int i = 1; i <=a; i++) {
		 
		 System.out.println("Enter the"+i+"Number :");
		 b=in.nextInt();
		 sum+=b;
		
	}
	 avg=sum/a;
	 System.out.println("Total Mark is:"+sum);
	 System.out.println("Average is:"+avg);
	 
	}
	
 }

