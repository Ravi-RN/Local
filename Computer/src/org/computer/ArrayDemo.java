package org.computer;

public class ArrayDemo {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	//System.out.println(a[4]);
	int length = a.length;
	System.out.println(length);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
	int[] dummy = a.clone();
	dummy[4]=100;
	System.out.println("====dummy value====");
	for (int i : dummy) {
		System.out.println(i);
	}
}
}
