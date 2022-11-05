package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// 리스트의 반복
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 10; i <= 50; i += 10) {
			list.add(i);
		}
		
		System.out.println("list = " + list + "\n");
		
		
		// 1. 일반 for문 : index로 반복을 한다
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list[%d] = %d\n", i, list.get(i));
		}
		System.out.println();
		
		
		// 2. for-each : 요소를 하나씩 대입하며 반복
		// - 주로 index가 없는 구조에서 자주 사용한다
		for (int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 3. iterator : 순환자. 컬렉션을 순환하는 커서(cursor)
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {	// hasNext() : 커서를 움직이지 않고 다음 요소가 있는지 판별
			int n = it.next();	// next() : 커서를 다음 위치로 이동 후 그 위치의 요소를 반환
			
			System.out.println("n = " + n);
		}
		
		
		System.out.println("it 다음? " + it.hasNext());
		// - 이동한 커서는 자동으로 다시 앞으로 돌아오지 않는다
		
		
		it = list.iterator();
		// - 만약 다시 순환을 원하면 위치를 다시 받으면 된다
		
		System.out.println("it 다음? " + it.hasNext());
	}
}
