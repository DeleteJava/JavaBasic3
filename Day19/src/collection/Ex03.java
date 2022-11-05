package collection;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		// ArrayList나 LinkedList는 사용 방식이 똑같다
		// - 저장하는 내부 구조가 다르다
		//
		// 1. ArrayList		: 배열 기반으로 작성한 리스트. 속도가 빠름, 추가/삭제에 오버헤드가 발생
		// 2. LinkedList 	: 연결 노드 기반으로 작성한 리스트. ArrayList보단 살짝 느리다. 단, 추가/삭제에 오버헤드가 전혀 없음 
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list);
	
		// 나머지 메서드도 모두 동일하니 나중에 한번써보세요~
	}
}
