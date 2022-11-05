package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// Map의 Key은 String이 90% 이상
		// Value는 Object가 90% 이상의 비중으로 사용된다
		//
		// 왜?
		// - 사람이 가장 쓰기 쉬운 데이터 형태가 '문자열'이므로 Key는 String을
		// - 모든 데이터를 저장받고 싶기 때문에 Value는 Object를 주로 사용
		
		HashMap<String, Object> hong = new HashMap<String, Object>();
		
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
