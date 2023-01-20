package org.computer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {
public static void main(String[] args) {
	List<Integer> li = new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	li.add(10);
	li.add(10);
	li.add(40);
	li.add(50);
	System.out.println(li);
	int size = li.size();
	System.out.println(size);
	System.out.println("==first index==");
	int indexOf = li.indexOf(10);
	System.out.println(indexOf);
	System.out.println("==last index==");
	int lastIndexOf = li.lastIndexOf(10);
	System.out.println(lastIndexOf);


}
}
