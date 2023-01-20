package org.computer;

public class NewArrayDemo {
public static void main(String[] args) {
	int a[]= {10,10,20,50,60,80,60,50};
	int b=0,c;
	int length = a.length;
System.out.println("=====Sum of Array and Average====");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		b+=a[i];
	}
	System.out.println(b);
	c=b/a.length;
System.out.println(c);
	

	}
}
