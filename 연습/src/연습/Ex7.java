package ����;

import java.util.*;

public class Ex7 {
	public static void main(String[] args) {
		Set set = new HashSet(10);
		set.add("0");
		set.add("1");
		set.add("2");
		
		//Iterator�� �ܹ������� ����.(������ Ŀ���� ����)
		//[null] 0 1 2
		Iterator it = set.iterator();
		
		if(it.hasNext())
			it.next();
			it.remove();
		System.out.println(set);
		it.next();
		it.remove();
		System.out.println(set);
	}	
}
