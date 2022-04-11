package ¿¬½À;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ex3 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(100000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		System.out.println(access(al));
		System.out.println(access(ll));
		
	}//end main

	public static void add(List list) {
		for(int i = 0; i<100000; i++) list.add(i+"");
	}
	
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
}
