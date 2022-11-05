package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 사용자에게 정수를 입력 받아서 그대로 출력하는 코드를 작성한다
		// 단, 정수가 아니면 프로그램을 종료하지 않고 다시 입력 받을 수 있게 예외 처리를 한다
		//
		// ※ 힌트 : 버퍼가 뭐 였습니까?
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		while (true) {
			try {
			
				System.out.print("정수 입력 : ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				
				break;
			
			} catch(InputMismatchException e) {
				System.err.println("정수가 아닙니다. 다시 입력해 주세요\n");
				sc.nextLine();
			}
		
		}
		
		sc.close();
	}
}
