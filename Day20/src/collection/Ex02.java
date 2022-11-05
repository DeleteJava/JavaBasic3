package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		// Map : key와 value의 한쌍의 자료구조
		// - list은 index를 대신하는 부분이 key
		//
		// ※ 타 프로그램끼리 데이터를 주고 받는 표준 문서가 XML, JSON이라는 언어가 있다
		// 이들은 데이터를 key, value로 표현하는데 자바에서 이 데이터들을 가져올때, Map 자주 사용한다
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(70);
		list.add(60);
		list.add(80);
		
		System.out.println("list = " + list);
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Java", 70);
		map.put("Python", 60);
		map.put("C++", 80);
		
		System.out.println("map = " + map + "\n");
		
		
		// 배열이나 컬렉션에 저장된 데이터를 요소(elements)라고 한다
		// 1. 리스트는 요소를 참조하기 위해서 index를 사용한다
		System.out.println("list[1] = " + list.get(1));
		
		// 2. 맵은 요소를 참조하기 위해서 같이 저장한 key를 사용한다
		System.out.println("map[\"Python\"] = " + map.get("Python"));
	}
}
