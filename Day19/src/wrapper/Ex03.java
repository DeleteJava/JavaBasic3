package wrapper;

// ���׸� : �Ϲ�ȭ
// ���׸� ���α׷��� : �ڷ����� ���� ���� �ʴ� ���α׷��� ���
// ���׸� Ÿ���� <> �� ǥ���ȴ�
//
// ���׸� Ÿ���� ������ Ŭ���� Ÿ�Ը� �����ϴ�
// ��, �Ϲ� �ڷ����� ����� �� ����

public class Ex03 {
	
	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	
	public static void main(String[] args) {
		// �Ϲ� Ÿ��
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		// Ŭ���� Ÿ��
		Integer[] arr2 = new Integer[] { 10,20,30,40,50 };
		Double[] arr3 = new Double[] { 3.14, 1.123, 5.1 };
		String[] arr4 = new String[] { "Java", "C++", "Python" };
		
		
		printArr(arr2);
		printArr(arr3);
		printArr(arr4);
		
		// printArr(arr1);
		// - ���׸��� ���۹���� Object�� ��� ��ĳ���� �ؼ� �޾� ó���ϴ� ������ ������
		// - ����, �Ϲ� Ÿ���� int�� Object�� �޾��� �� ����
	}
}
