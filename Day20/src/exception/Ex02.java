package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// �Ź� try ~ catch�� ���� �ڵ� ����� Ŀ����
		// ����, �� try �������� ���� ���ܸ� ó���ϴ� '���� ���� ó��'�� �����Ѵ�
		
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			int[] arr = new int[] { 10,20,30,40,50,60 };
		
			System.out.print("���� �Է� : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
			
			System.out.printf("10 / %d = %d\n", n, 10 / n);
			
			System.out.printf("arr[%d] = %d\n", n, arr[n]);
			
		} catch(InputMismatchException e) {
			System.err.println("���� �޼��� : ������ �ƴմϴ�!!!");
			
		} catch(ArithmeticException e) {
			System.err.println("���� �޼��� : " + e.getMessage());
			
		} catch(Exception e) {
			// Exception Ŭ������ '������ �ֻ��� Ŭ����'�̴�
			// - ��� ���� Ŭ������ �̸� ��� �޴´�. 
			// - ��, � ���ܴ� ��ĳ�������� �� �޾����ٴ� �ǹ�
			// - ���� �˼����� ���ܸ� ���ؼ� �ۼ��Ѵ�. Ȥ�� ���ܸ� ���ϰ� ���� ��������
			
			System.err.println("���� �޼��� : " + e.getMessage() + "�� index�� ����");
			return;
			
		} finally {
			// finally : ���� �߻� ���ο� ������� '������' ����ȴ�
			// - ������ �޼��尡 �߰��� ���� �Ǵ��� ����ȴ�
			// - �ַ� �ڿ� �����ϴ� �ڵ带 ����
		
			System.out.println("��ĳ�� ����~~");
			sc.close();
		}
	}
}
