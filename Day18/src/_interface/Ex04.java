package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	public static void main(String[] args) {
		String[] lang = new String[] { "Python", "C++", "Java", "SQL" };
		
		System.out.println("정렬 전 : " + Arrays.toString(lang));
		
		
		Comparator<String> asc = (String o1, String o2) -> {
			return o1.compareTo(o2);	// o1 - o2라고 생각하면 됩니다~
		};
		
		Arrays.sort(lang, asc);
		
		System.out.println("정렬 후 : " + Arrays.toString(lang));
		
		
		
		Arrays.sort(lang, (String o1, String o2) -> o2.compareTo(o1));
		
		System.out.println("정렬 후 : " + Arrays.toString(lang));
	}
}
