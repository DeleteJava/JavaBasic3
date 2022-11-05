package collection;

import java.util.Random;
import java.util.TreeSet;

//	�ζ� �˰���
//	1. 1 ~ 45 ������ ������ ���� �̴´�
//	2. �ߺ� ���� 6���� �̴´�
//	3. ��� ��ǥ�� ������������ ����Ѵ�

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
