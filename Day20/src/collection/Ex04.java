package collection;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Ex04 {
	public static void main(String[] args) {
		
		TreeMap<String, Object> hong = new TreeMap<String, Object>();
		// TreeMap은 이전의 TreeSet처럼 출력시 정렬 되어서 출력됨
		// - Key를 기준으로 오름차순이 기본값
		
		hong.put("name", "홍길동");
		hong.put("age", 23);
		hong.put("height", 173.5);
		hong.put("isArmy", true);
		
		String[] arr = new String[] { "게임", "영화", "음악" };
		List<String> hobby = Arrays.asList(arr);
		
		hong.put("hobby", hobby);
		
		System.out.println("hong = " + hong);
		
	}
}
