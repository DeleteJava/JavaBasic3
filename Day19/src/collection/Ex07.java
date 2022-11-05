package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex07 {
	public static void main(String[] args) {
		// Tree : 비선형 자료구조 중 하나
		// 출력시 정렬된것 처럼 출력됨
		
		HashSet<Integer> hs = new HashSet<Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Random ran = new Random();
		
		for (int i = 0; i < 10; i++) {
			int n = ran.nextInt(20) + 1;
			
			hs.add(n);
			ts.add(n);
		}
		
		
		System.out.println("hs = " + hs);
		System.out.println("ts = " + ts);
	}
}
