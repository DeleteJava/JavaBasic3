package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// Map�� Key�� String�� 90% �̻�
		// Value�� Object�� 90% �̻��� �������� ���ȴ�
		//
		// ��?
		// - ����� ���� ���� ���� ������ ���°� '���ڿ�'�̹Ƿ� Key�� String��
		// - ��� �����͸� ����ް� �ͱ� ������ Value�� Object�� �ַ� ���
		
		HashMap<String, Object> hong = new HashMap<String, Object>();
		
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
