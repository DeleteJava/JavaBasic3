package wrapper;

// Wrap : ���δ�
// Wrapper Ŭ������ �Ϲ� �ڷ��� Ÿ���� Ŭ����. ��, ��ü�� ǥ���ϱ� ���ؼ� ���� Ŭ������
//
// �ֵ� ���ó��
// 1. ���ڿ��� ����ȯ��
// 2. ��ü�� ó���� �ؾ��ϴ� ���. Ex) ���׸� Ÿ��

public class Ex01 {
	public static void main(String[] args) {
		// �Ϲ� �ڷ���			Wrpper Ŭ����
		// ------------------------------
		// boolean			Boolean
		// char				Character
		// byte				Byte
		// short			Short
		// int				Integer
		// long				Long
		// float			Float
		// double			Double
		
		int it1 = 10;
		Integer it2 = 20;
		
		System.out.printf("it1 = %d, it2 = %d\n\n", it1, it2);
		
		
		System.out.println("10���� : " + it1);
		System.out.println("2���� : " + Integer.toBinaryString(it1));
		System.out.println("8���� : " + Integer.toOctalString(it1));
		System.out.println("16���� : " + Integer.toHexString(it1));
		// Integer�� Ŭ�����̱� ������, ���� �޼��嵵 �Բ� ������
		// - ��, �Ϲ� �ڷ��� int ���ٴ� �翬�� �뷮�� ũ��
		// - ����, ���� �ʿ��� ��찡 �ƴϸ� int�� ���� ���� �����ϴ�
		
	}
}
