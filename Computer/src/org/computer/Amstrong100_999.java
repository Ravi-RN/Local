package org.computer;

public class Amstrong100_999 {
public static void main(String[] args) {
	int b,c,d,temp,ams;
	for (int i = 100; i <=999; i++) {
		temp=i;
		b=temp%10;
		temp=temp/10;
		c=temp%10;
		temp=temp/10;
		d=temp%10;
		ams=b*b*b+c*c*c+d*d*d;
		if (ams==i) {
			System.out.println(+ams+"is Amstrong");
			}
		}
	}
}
