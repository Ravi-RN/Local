package org.computer;

import java.util.ArrayList;
import java.util.List;

public class CollectionListDemo {
public static void main(String[] args) {
	List<Integer> li =new ArrayList<>();
	li.add(11);
	li.add(22);
	li.add(33);
	li.add(null);
	li.add(11);
	li.add(null);
	System.out.println(li);
	int size = li.size();
	System.out.println(size);
	Integer set = li.set(3, 77);
	System.out.println(li);
	System.out.println("====Value======");
	for (int i = 0; i < size; i++) {
		System.out.println(li.get(i));
		
	}
}
}
