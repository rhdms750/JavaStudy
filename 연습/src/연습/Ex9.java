package 연습;

import java.util.*;

public class Ex9 {
	public static void main(String[] args) {
		//Set는 중복불가, 순서없음 
		Set set = new HashSet();

		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		
	}	
}
