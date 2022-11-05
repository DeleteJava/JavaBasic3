package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// throws�� throw
// - ��/������ �ƴϴ�!!!
// - throws�� �ش� �޼��忡�� ���ܸ� '����' �ϰڴٴ� �ǹ̰�
// - throw�� �����ڰ� ���ܸ� �Ϻη� �߻���Ű�� ���� (�ַ�, Ư�� ������ �ɰ� ����)

public class Ex04 {
	
	static void timer(int n) throws InterruptedException {
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "��");
			
			Thread.sleep(1000);
		}
	}
	
	static void isOver(int n) throws InterruptedException {
		if (n > 5) {
			throw new InterruptedException("5���Ϸ� �Է��� �ּ���!!!");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("Ÿ�̸� �Է�(5 ���ϸ� ����) ");
			n = sc.nextInt();
			
			isOver(n);
			
			timer(n);
			
		} catch(InputMismatchException | InterruptedException e) {
			String msg = e.getMessage();
			
			if (msg == null) { msg = "������ �Է��� �ּ���"; }
			
			System.err.println("���� �޼��� : " + msg);
			
		} finally {
			sc.close();
		}
		
	}
}
