package ����;

import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ex4 {
	public static void main(String[] args) {
		//������ vector�� ����ϴ� Ŭ����
		Stack st = new Stack();
		//ť�� �������̽�. ��ũ�帮��Ʈ�� �����ߴ�.
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		//�� ��ũ���ϱ�? ť�� ������� ���� ��.
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
