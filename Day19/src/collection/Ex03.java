package collection;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		// ArrayList�� LinkedList�� ��� ����� �Ȱ���
		// - �����ϴ� ���� ������ �ٸ���
		//
		// 1. ArrayList		: �迭 ������� �ۼ��� ����Ʈ. �ӵ��� ����, �߰�/������ ������尡 �߻�
		// 2. LinkedList 	: ���� ��� ������� �ۼ��� ����Ʈ. ArrayList���� ��¦ ������. ��, �߰�/������ ������尡 ���� ���� 
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list);
	
		// ������ �޼��嵵 ��� �����ϴ� ���߿� �ѹ��Ẹ����~
	}
}
