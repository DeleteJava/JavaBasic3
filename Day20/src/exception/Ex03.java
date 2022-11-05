package exception;

// throws : 예외를 전가하는 구문. 호출한 위치로 예외가 떠넘겨짐
// - 해당 위치에서 예외를 처리하거나 혹은 또 전가를 할 수 있다
// - ※ main에서까지 예외가 전가되면 JVM이 받아서 처리하고 예외 발생시 프로그램이 종료됨

public class Ex03 {
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
		System.out.println();
		
	}
}
