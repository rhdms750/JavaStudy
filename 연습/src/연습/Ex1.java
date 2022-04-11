package 연습;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		//데이터를 읽어오고 저장하는 데는 효율이 좋지만
		//용량을 변경해야 할 때는 비효율적
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
