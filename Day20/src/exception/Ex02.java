package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 매번 try ~ catch를 쓰면 코드 덩어리가 커진다
		// 따라서, 한 try 구문에서 여러 예외를 처리하는 '다중 예외 처리'를 지원한다
		
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			int[] arr = new int[] { 10,20,30,40,50,60 };
		
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
			
			System.out.printf("10 / %d = %d\n", n, 10 / n);
			
			System.out.printf("arr[%d] = %d\n", n, arr[n]);
			
		} catch(InputMismatchException e) {
			System.err.println("예외 메세지 : 정수가 아닙니다!!!");
			
		} catch(ArithmeticException e) {
			System.err.println("예외 메세지 : " + e.getMessage());
			
		} catch(Exception e) {
			// Exception 클래스는 '예외의 최상위 클래스'이다
			// - 모든 예외 클래스는 이를 상속 받는다. 
			// - 즉, 어떤 예외는 업캐스팅으로 다 받아진다는 의미
			// - 보통 알수없는 예외를 위해서 작성한다. 혹은 예외를 상세하게 쓰기 귀찮을때
			
			System.err.println("예외 메세지 : " + e.getMessage() + "번 index는 없음");
			return;
			
		} finally {
			// finally : 예외 발생 여부에 상관없이 '무조건' 실행된다
			// - 심지어 메서드가 중간에 종료 되더라도 실행된다
			// - 주로 자원 해제하는 코드를 쓴다
		
			System.out.println("스캐너 해제~~");
			sc.close();
		}
	}
}
