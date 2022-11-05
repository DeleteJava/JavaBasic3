package _interface;

import java.util.Arrays;
import java.util.Comparator;

// 1. Comparable
// - Ŭ������ ��� �޾Ƽ� ����ϴ� �������̽�
// - �ش� Ŭ������ �⺻ �� ������ �ȴ�
//
// 2. Comparator
// - �ȿ� �ִ� compare()��� �޼��带 �����ؼ� ����Ѵ�
// - �ַ� �ٸ� �� ������ ����ϰ� ������ ���

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	@Override
	public int compareTo(Person o) {
		// this = ��, o = ��
		
		return o.age - age;
	}
	
	String getName() {
		return name;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		
		Person[] pers = new Person[] { 
				new Person("ȫ�浿", 23),
				new Person("��浿", 36),
				new Person("�̱浿", 40)
		};
		
		
		System.out.println("���� �� : " + Arrays.toString(pers));
	
		// sort�� Comparator�� �������� ����
		// -> Comparable�� ����ؼ� ��
		Arrays.sort(pers);
		System.out.println("���� �� : " + Arrays.toString(pers));
		
		
		Comparator<Person> nameAsc = (Person o1, Person o2) -> {
			String name1 = o1.getName();
			String name2 = o2.getName();
			
			int result = name1.compareTo(name2);
			
			return result;
		};
		
		
		// Comparator�� �����ϸ�
		// Comparable ��� ������ ��ü�� ��
		Arrays.sort(pers, nameAsc);
		System.out.println("���� �� : " + Arrays.toString(pers));
	
	}
}
