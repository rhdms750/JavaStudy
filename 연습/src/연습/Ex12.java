package ����;

import java.util.*;

public class Ex12 {
	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		
		for(int i = 0; set.size()<25; i++) {
			set.add((int)Math.random()*50+1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				
			}
		}
		
	}	
}
