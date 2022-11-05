package _interface;

import java.util.Arrays;
import java.util.Comparator;

// 1. Comparable
// - 클래스에 상속 받아서 사용하는 인터페이스
// - 해당 클래스의 기본 비교 기준이 된다
//
// 2. Comparator
// - 안에 있는 compare()라는 메서드를 구현해서 사용한다
// - 주로 다른 비교 기준을 사용하고 싶을때 사용

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
		// this = 앞, o = 뒤
		
		return o.age - age;
	}
	
	String getName() {
		return name;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		
		Person[] pers = new Person[] { 
				new Person("홍길동", 23),
				new Person("김길동", 36),
				new Person("이길동", 40)
		};
		
		
		System.out.println("정렬 전 : " + Arrays.toString(pers));
	
		// sort에 Comparator를 전달하지 않음
		// -> Comparable을 사용해서 비교
		Arrays.sort(pers);
		System.out.println("정렬 후 : " + Arrays.toString(pers));
		
		
		Comparator<Person> nameAsc = (Person o1, Person o2) -> {
			String name1 = o1.getName();
			String name2 = o2.getName();
			
			int result = name1.compareTo(name2);
			
			return result;
		};
		
		
		// Comparator를 전달하면
		// Comparable 대신 전달한 객체로 비교
		Arrays.sort(pers, nameAsc);
		System.out.println("정렬 후 : " + Arrays.toString(pers));
	
	}
}
