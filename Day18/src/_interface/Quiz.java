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
		String result = "%s (�� %d, �� %d, �� %d)";
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
			System.out.println(arr[i] + " -> �� : " + arr[i].total());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 1. �л� Ŭ������ �����Ѵ�
		// �ʵ�� �̸�, �� �� �� ������ ������
		// �޼��� ���ϴµ��� �ۼ��ص� ����
		
		// 2. 1���� ������ �л� Ŭ������ 5���� �ν��Ͻ��� ����� �迭�� ����
		Student[] stus = new Student[] {
				new Student("ȫ�浿", 70, 56, 72),
				new Student("��浿", 91, 52, 63),
				new Student("�ڱ浿", 87, 78, 77),
				new Student("�̱浿", 45, 99, 81),
				new Student("��浿", 75, 56, 68)
		};
		
		
		// 3. �ϴ� �Ϸķ� �׳� ����غ���
		showArr(stus);
		
		// 4. ���� ������ �������� ������ �����Ѵ�
		// Comparable Ȥ�� Comparator �ƹ��ų� ����ص� ����
		Arrays.sort(stus);
		showArr(stus);
		
		// 5. 1��� �õ��� ����غ���
		System.out.println("1�� : " + stus[0]);
		System.out.println("�õ� : " + stus[stus.length - 1] + "\n");
		
		
		// Etc. ������ ��������
		Arrays.sort(stus, (Student s1, Student s2) -> s1.total() - s2.total());
		showArr(stus);
		
		
	}
}
