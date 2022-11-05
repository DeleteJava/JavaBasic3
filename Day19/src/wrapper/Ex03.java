package wrapper;

// 제네릭 : 일반화
// 제네릭 프로그래밍 : 자료형에 구애 받지 않는 프로그래밍 방식
// 제네릭 타입은 <> 로 표현된다
//
// 제네릭 타입은 오로지 클래스 타입만 가능하다
// 즉, 일반 자료형은 사용할 수 없다

public class Ex03 {
	
	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	
	public static void main(String[] args) {
		// 일반 타입
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		// 클래스 타입
		Integer[] arr2 = new Integer[] { 10,20,30,40,50 };
		Double[] arr3 = new Double[] { 3.14, 1.123, 5.1 };
		String[] arr4 = new String[] { "Java", "C++", "Python" };
		
		
		printArr(arr2);
		printArr(arr3);
		printArr(arr4);
		
		// printArr(arr1);
		// - 제네릭의 동작방식은 Object로 모두 업캐스팅 해서 받아 처리하는 원리를 가진다
		// - 따라서, 일반 타입인 int은 Object로 받아질 수 없다
	}
}
