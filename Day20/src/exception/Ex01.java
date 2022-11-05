package exception;

// 오류 : 프로그램에 비정상적인 동작을 의미
// 1. 에러 : 시스템 레벨의 오류. 개발자가 처리할 수 없는 부분
// 2. 예외 : 잘못된 코드 로직으로 발생한 오류. 개발자가 예측 후 처리 가능
//
// 예외를 예측해서 처리하는 구문을 '예외 처리'라고 한다

public class Ex01 {
	public static void main(String[] args) {
		
		try {	// try : 예외를 검사하는 구문
			System.out.println("10 / 2 = " + 10 / 0);
			
			// try 내에서 예외가 발생한 시점이 후로는 흐름이 catch로 넘어간다
			// 즉, 예외 발생 이후 코드는 수행되지 않음
			System.out.println("정상 종료!!!");
			
		
		} catch (ArithmeticException e) {
			// 예외 메세지를 잘 작성해 높으면, 버그나 에러 검출이 수월해진다
			
			System.err.println("예외 발생 : 0으로 나눔");				// 1. 직접 작성한다 -> 예외를 알 때
			System.err.println("예외 메세지 : " + e.getMessage());	// 2. mesage를 받아서 출력 -> 예외를 모르거나 메세지가 자주 바뀌는 경우
																//    ※ 메세지가 없는 경우도 있음~
			
			e.printStackTrace();								// 3. 어떤 메서드에서 예외가 발생했는지 추적해서 출력
																//    상세한 내용을 보고 싶을 때
		}
		
		System.out.println("여기는 출력이 되나요???");
	}
}
