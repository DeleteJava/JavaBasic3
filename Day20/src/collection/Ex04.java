package collection;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Ex04 {
	public static void main(String[] args) {
		
		TreeMap<String, Object> hong = new TreeMap<String, Object>();
		// TreeMap�� ������ TreeSetó�� ��½� ���� �Ǿ ��µ�
		// - Key�� �������� ���������� �⺻��
		
		hong.put("name", "ȫ�浿");
		hong.put("age", 23);
		hong.put("height", 173.5);
		hong.put("isArmy", true);
		
		String[] arr = new String[] { "����", "��ȭ", "����" };
		List<String> hobby = Arrays.asList(arr);
		
		hong.put("hobby", hobby);
		
		System.out.println("hong = " + hong);
		
	}
}
