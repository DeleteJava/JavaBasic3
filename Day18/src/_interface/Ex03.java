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
		
		
		
		// ※ 전달인자에서 바로 람다식으로 작성해서 넘길수도 있다
		// 단, {}와 return을 작성하면 안됩니다~
		Arrays.sort(arr, (Integer o1, Integer o2) -> o1 - o2);
		
		System.out.println("arr = " + Arrays.toString(arr));
	}
}
