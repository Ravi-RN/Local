package org.computer;

public class StaticDemo {
	int a = 777;
static {
	System.out.println("hello");
}
private static void one() {
	System.out.println("hai");

}
public static void main(String[] args) {
	one();
}
}
