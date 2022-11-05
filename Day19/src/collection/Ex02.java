package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// ����Ʈ�� �ݺ�
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 10; i <= 50; i += 10) {
			list.add(i);
		}
		
		System.out.println("list = " + list + "\n");
		
		
		// 1. �Ϲ� for�� : index�� �ݺ��� �Ѵ�
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list[%d] = %d\n", i, list.get(i));
		}
		System.out.println();
		
		
		// 2. for-each : ��Ҹ� �ϳ��� �����ϸ� �ݺ�
		// - �ַ� index�� ���� �������� ���� ����Ѵ�
		for (int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 3. iterator : ��ȯ��. �÷����� ��ȯ�ϴ� Ŀ��(cursor)
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {	// hasNext() : Ŀ���� �������� �ʰ� ���� ��Ұ� �ִ��� �Ǻ�
			int n = it.next();	// next() : Ŀ���� ���� ��ġ�� �̵� �� �� ��ġ�� ��Ҹ� ��ȯ
			
			System.out.println("n = " + n);
		}
		
		
		System.out.println("it ����? " + it.hasNext());
		// - �̵��� Ŀ���� �ڵ����� �ٽ� ������ ���ƿ��� �ʴ´�
		
		
		it = list.iterator();
		// - ���� �ٽ� ��ȯ�� ���ϸ� ��ġ�� �ٽ� ������ �ȴ�
		
		System.out.println("it ����? " + it.hasNext());
	}
}
