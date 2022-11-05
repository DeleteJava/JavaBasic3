package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// throws와 throw
// - 단/복수가 아니다!!!
// - throws는 해당 메서드에서 예외를 '전가' 하겠다는 의미고
// - throw는 개발자가 예외를 일부러 발생시키는 구문 (주로, 특정 조건을 걸고 쓴다)

public class Ex04 {
	
	static void timer(int n) throws InterruptedException {
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
	}
	
	static void isOver(int n) throws InterruptedException {
		if (n > 5) {
			throw new InterruptedException("5이하로 입력해 주세요!!!");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("타이머 입력(5 이하만 가능) ");
			n = sc.nextInt();
			
			isOver(n);
			
			timer(n);
			
		} catch(InputMismatchException | InterruptedException e) {
			String msg = e.getMessage();
			
			if (msg == null) { msg = "정수로 입력해 주세요"; }
			
			System.err.println("예외 메세지 : " + msg);
			
		} finally {
			sc.close();
		}
		
	}
}
