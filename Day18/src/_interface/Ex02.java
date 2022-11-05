package _interface;

import other.USB;


public class Ex02 {
	public static void main(String[] args) {
		// 익명 중첩 클래스
		// - 이름 없는 클래스. 일회용
		// - 보통 기능이 구현되어 있지 않은 
		//   추상 클래스나, 인터페이스의 객체를 상속 없이 생성하고 싶을때 사용
		
		USB usb = new USB() {
			@Override
			public void run() {
				System.out.println("32GB 연결~");
			}
		};
		
		
		PC pc = new PC();
		
		pc.connect(usb);
		
		
		// ※ Java 1.8 이후 부터 함수형 인터페이스는
		// 람다식이라는 형태를 통해서 좀 더 쉽게 객체를 생성할 수 있다
		USB usb2 = () -> {
			System.out.println("64GB 연결");
		};
		
		
		pc.connect(usb2);
		
	}
}
