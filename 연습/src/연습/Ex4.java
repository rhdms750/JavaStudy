package 연습;

import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ex4 {
	public static void main(String[] args) {
		//스택은 vector를 상속하는 클래스
		Stack st = new Stack();
		//큐는 인터페이스. 링크드리스트가 구현했다.
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		//왜 링크드일까? 큐는 순서대로 들어가는 애.
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
	}//end main

	
}
