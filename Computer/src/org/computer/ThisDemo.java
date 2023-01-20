package org.computer;

public class ThisDemo extends StaticDemo {
	int a=555;
	private void demo() {
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		ThisDemo in=new ThisDemo();
		in.demo();
		
	}

}
