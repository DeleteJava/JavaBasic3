package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		// List : ����o, �ߺ�o, ����o
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(10);
		list.add(20);
		
		System.out.println("list = " + list);
		
		
		// Set : ����x, �ߺ�x, ����x (��, �߰�/���Ŵ� ����)
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(10);
		set.add(20);
		
		System.out.println("set = " + set);
	}
}
