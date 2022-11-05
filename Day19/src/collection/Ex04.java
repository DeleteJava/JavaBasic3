package collection;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		// Set : 순서x, 중복x
		//
		// 구현한 클래스들)
		// - HashSet, TreeSet
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);		// 중복된 값은 무시
		
		System.out.println("hs = " + hs);
		
		// System.out.println("hs[1] = " + hs.get(1));
		// - 순서가 없다는 의미는 index가 없다는 의미
		
		System.out.println("hs의 크기 : " + hs.size());
		
		
		hs.remove(10);
		// - index가 없기 때문에 위치가 아닌 값으로 제거한다
		
		System.out.println("hs = " + hs);
		
	}
}
