package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		Random ran = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 10; i++) {
			int n = (ran.nextInt(5) + 1) * 10;
			
			list.add(n);
		}
		
		
		System.out.println("list = " + list + "\n");
		
		
		// list -> set
		// - 생성자를 쓰면 수월하게 가능
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		System.out.println("hs = " + hs + "\n");
		
		
		// set -> list
		list = new ArrayList<Integer>(hs);
		
		System.out.println("list = " + list);
		System.out.println("list[1] = " + list.get(1) + "\n");
		
		
		Comparator<Integer> desc = (Integer o1, Integer o2) -> o2 - o1;
		
		list.sort(desc);
		System.out.println("list = " + list);
	}
}
