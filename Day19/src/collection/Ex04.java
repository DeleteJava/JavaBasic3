package collection;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		// Set : ����x, �ߺ�x
		//
		// ������ Ŭ������)
		// - HashSet, TreeSet
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);		// �ߺ��� ���� ����
		
		System.out.println("hs = " + hs);
		
		// System.out.println("hs[1] = " + hs.get(1));
		// - ������ ���ٴ� �ǹ̴� index�� ���ٴ� �ǹ�
		
		System.out.println("hs�� ũ�� : " + hs.size());
		
		
		hs.remove(10);
		// - index�� ���� ������ ��ġ�� �ƴ� ������ �����Ѵ�
		
		System.out.println("hs = " + hs);
		
	}
}
