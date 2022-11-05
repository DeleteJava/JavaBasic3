package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		// Map : key�� value�� �ѽ��� �ڷᱸ��
		// - list�� index�� ����ϴ� �κ��� key
		//
		// �� Ÿ ���α׷����� �����͸� �ְ� �޴� ǥ�� ������ XML, JSON�̶�� �� �ִ�
		// �̵��� �����͸� key, value�� ǥ���ϴµ� �ڹٿ��� �� �����͵��� �����ö�, Map ���� ����Ѵ�
		
		
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
		
		
		// �迭�̳� �÷��ǿ� ����� �����͸� ���(elements)��� �Ѵ�
		// 1. ����Ʈ�� ��Ҹ� �����ϱ� ���ؼ� index�� ����Ѵ�
		System.out.println("list[1] = " + list.get(1));
		
		// 2. ���� ��Ҹ� �����ϱ� ���ؼ� ���� ������ key�� ����Ѵ�
		System.out.println("map[\"Python\"] = " + map.get("Python"));
	}
}
