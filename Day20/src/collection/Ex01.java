package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		// List : 순서o, 중복o, 편집o
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(10);
		list.add(20);
		
		System.out.println("list = " + list);
		
		
		// Set : 순서x, 중복x, 편집x (단, 추가/제거는 가능)
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(10);
		set.add(20);
		
		System.out.println("set = " + set);
	}
}
