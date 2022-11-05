package collection;

import java.util.ArrayList;

// collection : 모음
// collection framework : 자바에서 제공하는 자료구조 및 알고리즘을 의미
//
// 종류
// 1. List	: 순서o, 중복o, 수정o
// 2. Set	: 순서x, 중복x, 수정x (추가나 삭제는 가능)
// 3. Map	: key와 value의 한쌍의 구조
//			  key는 중복x, value는 중복o
//
// ※ 위의 세 타입은 모두 Interface이므로 바로 사용이 불가능하다
// - 저 Interface를 상속 받아서 구현한 클래스들이 있고 그것들을 사용한다

public class Ex01 {
	public static void main(String[] args) {
		// List를 구현한 클래스
		// - ArrayList, LinkedList, Vector
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("list = " + list);
		// - collection은 대부분 이미 toString()이 오버라이딩이 되어있다
		
		
		list.add(10);		// add(값) : 전달한 데이터를 리스트 가장 끝에 추가
		list.add(20);
		list.add(30);
		
		list.add(10);		// 데이터의 중복이 허용된다
		
		System.out.println("list = " + list + "\n");
		
		
		list.add(1, 50);	// add(index, 값) : 해당 index 위치에 값을 추가
		System.out.println("list = " + list + "\n");
		
		list.set(2, 80);	// set(index, 값) : 해당 index 위치의 값을 덮어씀 
		System.out.println("list = " + list + "\n");
		
		
		System.out.println("list[2] = " + list.get(2));
		System.out.println("list = " + list + "\n");
		// get(index) : 해당 index의 값을 리턴 (※ 리스트에서 꺼내진 않음)
		
		
		System.out.println("꺼낸값 : " + list.remove(2));
		System.out.println("list = " + list + "\n");
		// remove(index) : 해당 index의 값을 꺼낸다
		
		
		System.out.println("list의 크기 : " + list.size());
		// size() : 현재 저장된 요소의 개수를 반환
		
		
		list.clear();
		System.out.println("list = " + list);
		// clear() : 요소를 모두 제거
	}
}
