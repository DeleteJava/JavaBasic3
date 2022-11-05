package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] { 10, 50, 40, 20, 30 };
		
		System.out.println("arr = " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		
		Arrays.sort(arr, desc);
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		
		// �� �������ڿ��� �ٷ� ���ٽ����� �ۼ��ؼ� �ѱ���� �ִ�
		// ��, {}�� return�� �ۼ��ϸ� �ȵ˴ϴ�~
		Arrays.sort(arr, (Integer o1, Integer o2) -> o1 - o2);
		
		System.out.println("arr = " + Arrays.toString(arr));
	}
}
