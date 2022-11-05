package wrapper;

// Wrap : 감싸다
// Wrapper 클래스는 일반 자료형 타입을 클래스. 즉, 객체로 표현하기 위해서 만든 클래스들
//
// 주된 사용처는
// 1. 문자열과 형변환시
// 2. 객체로 처리를 해야하는 경우. Ex) 제네릭 타입

public class Ex01 {
	public static void main(String[] args) {
		// 일반 자료형			Wrpper 클래스
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
		
		
		System.out.println("10진수 : " + it1);
		System.out.println("2진수 : " + Integer.toBinaryString(it1));
		System.out.println("8진수 : " + Integer.toOctalString(it1));
		System.out.println("16진수 : " + Integer.toHexString(it1));
		// Integer는 클래스이기 때문에, 여러 메서드도 함께 가진다
		// - 단, 일반 자료형 int 보다는 당연히 용량이 크다
		// - 따라서, 굳이 필요한 경우가 아니면 int를 쓰는 것이 유리하다
		
	}
}
