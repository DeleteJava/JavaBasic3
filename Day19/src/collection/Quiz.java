package collection;

import java.util.Random;
import java.util.TreeSet;

//	로또 알고리즘
//	1. 1 ~ 45 사이의 무작위 수를 뽑는다
//	2. 중복 없이 6개를 뽑는다
//	3. 결과 발표시 오름차순으로 출력한다

public class Quiz {
	public static void main(String[] args) {
		
		Random ran = new Random();
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		
		while(lotto.size() != 6) {
			int n = ran.nextInt(45) + 1;
			
			lotto.add(n);
		}
		
		System.out.println("lotto = " + lotto);
	}
}
