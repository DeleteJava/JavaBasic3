package wrapper;

public class Ex02 {
	public static void main(String[] args) {
		// ���ڿ��� String���� 'Ŭ����'
		// - Ŭ������ �Ϲ� Ÿ�԰� ����ȯ�� �̷������ �ʴ´�
		
		String str1 = "10";
		String str2 = "20";
		
		System.out.println("str1 + str2 = " + (str1 + str2) + "\n");
		
		
		// ���ڿ� -> ����
		// int n1 = (int)str1;
		// - Ŭ������ �Ϲ�Ÿ������ ��ȯ�� �Ұ�~
		
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		// int parseInt(String s)
		// - ������ ���ڿ��� ������ �ٲ㼭 ����
		// - ��, ���ڰ� �ƴ� ���ڿ��� ���޵Ǹ� ����
		
		System.out.println("n1 + n2 = " + (n1 + n2) + "\n");
		
		
		// ���� -> ���ڿ�
		str1 = Integer.toString(3541);
		str2 = Integer.toString(8385);
		// String toString(int i)
		// - ������ ������ ���ڿ��� �ٲ㼭 ����
		
		System.out.println("str1 + str2 = " + (str1 + str2) + "\n");
		
		
		
		// �� ���� -> ���ڿ��� �� �� ���� �ϴ� ��
		String str3 = "" + 10 + 13;
		String str4 = 10 + 13 + "";
		
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		
		
		// �� ���ڿ� -> �Ǽ�
		double pi = Double.parseDouble("3.141592");
		
		System.out.println("pi = " + pi);
	}
}
