package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// ����ڿ��� ������ �Է� �޾Ƽ� �״�� ����ϴ� �ڵ带 �ۼ��Ѵ�
		// ��, ������ �ƴϸ� ���α׷��� �������� �ʰ� �ٽ� �Է� ���� �� �ְ� ���� ó���� �Ѵ�
		//
		// �� ��Ʈ : ���۰� �� �����ϱ�?
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		while (true) {
			try {
			
				System.out.print("���� �Է� : ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				
				break;
			
			} catch(InputMismatchException e) {
				System.err.println("������ �ƴմϴ�. �ٽ� �Է��� �ּ���\n");
				sc.nextLine();
			}
		
		}
		
		sc.close();
	}
}
