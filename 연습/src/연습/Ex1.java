package ����;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		//�����͸� �о���� �����ϴ� ���� ȿ���� ������
		//�뷮�� �����ؾ� �� ���� ��ȿ����
		ArrayList v = new ArrayList();
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		
		v.trimToSize();
		System.out.println("===After trimToSize()===");
		
		v.ensureCapacity(6);
		System.out.println("===After trimToSize()===");
		
	}
	
	static void print(List l) {
		System.out.println(l);
		System.out.println("size : "+l.size());
	}
}
