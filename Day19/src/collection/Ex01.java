package collection;

import java.util.ArrayList;

// collection : ����
// collection framework : �ڹٿ��� �����ϴ� �ڷᱸ�� �� �˰����� �ǹ�
//
// ����
// 1. List	: ����o, �ߺ�o, ����o
// 2. Set	: ����x, �ߺ�x, ����x (�߰��� ������ ����)
// 3. Map	: key�� value�� �ѽ��� ����
//			  key�� �ߺ�x, value�� �ߺ�o
//
// �� ���� �� Ÿ���� ��� Interface�̹Ƿ� �ٷ� ����� �Ұ����ϴ�
// - �� Interface�� ��� �޾Ƽ� ������ Ŭ�������� �ְ� �װ͵��� ����Ѵ�

public class Ex01 {
	public static void main(String[] args) {
		// List�� ������ Ŭ����
		// - ArrayList, LinkedList, Vector
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("list = " + list);
		// - collection�� ��κ� �̹� toString()�� �������̵��� �Ǿ��ִ�
		
		
		list.add(10);		// add(��) : ������ �����͸� ����Ʈ ���� ���� �߰�
		list.add(20);
		list.add(30);
		
		list.add(10);		// �������� �ߺ��� ���ȴ�
		
		System.out.println("list = " + list + "\n");
		
		
		list.add(1, 50);	// add(index, ��) : �ش� index ��ġ�� ���� �߰�
		System.out.println("list = " + list + "\n");
		
		list.set(2, 80);	// set(index, ��) : �ش� index ��ġ�� ���� ��� 
		System.out.println("list = " + list + "\n");
		
		
		System.out.println("list[2] = " + list.get(2));
		System.out.println("list = " + list + "\n");
		// get(index) : �ش� index�� ���� ���� (�� ����Ʈ���� ������ ����)
		
		
		System.out.println("������ : " + list.remove(2));
		System.out.println("list = " + list + "\n");
		// remove(index) : �ش� index�� ���� ������
		
		
		System.out.println("list�� ũ�� : " + list.size());
		// size() : ���� ����� ����� ������ ��ȯ
		
		
		list.clear();
		System.out.println("list = " + list);
		// clear() : ��Ҹ� ��� ����
	}
}
