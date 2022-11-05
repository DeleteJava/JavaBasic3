package _interface;

import java.util.Arrays;

class Student implements Comparable<Student> {
	private String name;
	private int kor, eng, mat;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		String result = "%s (국 %d, 영 %d, 수 %d)";
		result = String.format(result, name, kor, eng, mat);
		
		return result;
	}
	
	int total() {
		return kor + eng + mat;
	}

	@Override
	public int compareTo(Student o) {
		
		return o.total() - total();
	}
}

public class Quiz {
	static void showArr(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " -> 합 : " + arr[i].total());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 1. 학생 클래스를 선언한다
		// 필드는 이름, 국 영 수 점수를 가진다
		// 메서드 원하는데로 작성해도 무관
		
		// 2. 1번에 생성한 학생 클래스로 5개의 인스턴스를 만들고 배열로 저장
		Student[] stus = new Student[] {
				new Student("홍길동", 70, 56, 72),
				new Student("김길동", 91, 52, 63),
				new Student("박길동", 87, 78, 77),
				new Student("이길동", 45, 99, 81),
				new Student("고길동", 75, 56, 68)
		};
		
		
		// 3. 일단 일렬로 그냥 출력해본다
		showArr(stus);
		
		// 4. 성적 순으로 내림차순 정렬을 적용한다
		// Comparable 혹은 Comparator 아무거나 사용해도 좋다
		Arrays.sort(stus);
		showArr(stus);
		
		// 5. 1등과 꼴등을 출력해본다
		System.out.println("1등 : " + stus[0]);
		System.out.println("꼴등 : " + stus[stus.length - 1] + "\n");
		
		
		// Etc. 성적순 오름차순
		Arrays.sort(stus, (Student s1, Student s2) -> s1.total() - s2.total());
		showArr(stus);
		
		
	}
}
