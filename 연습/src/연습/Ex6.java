package 연습;

import java.util.*;

public class Ex6 {
	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i = 0; i < 10; i++) {
			original.add(i+"");
		}
		
		//[null] 0 1 2 3 4 
		
		Iterator it = original.iterator(); //재사용 불가
		
		while(it.hasNext()) {
			copy2.add(it.next());
		}
		
		System.out.println("=Original에서 copy1로 복사(copy)");
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();
		
		//[null] 0 1 2 3 4 다시 커서를 null에 두는 iterator객체를 만들어야함
		
		it = original.iterator();
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("=Original에서 copy2로 이동=");
		System.out.println("original:"+original);
		System.out.println("copy2:"+copy2);
	}	
}
