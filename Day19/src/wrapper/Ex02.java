package wrapper;

public class Ex02 {
	public static void main(String[] args) {
		// 문자열은 String으로 '클래스'
		// - 클래스는 일반 타입과 형변환이 이루어지지 않는다
		
		String str1 = "10";
		String str2 = "20";
		
		System.out.println("str1 + str2 = " + (str1 + str2) + "\n");
		
		
		// 문자열 -> 정수
		// int n1 = (int)str1;
		// - 클래스는 일반타입으로 변환이 불가~
		
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		// int parseInt(String s)
		// - 전달한 문자열을 정수로 바꿔서 리턴
		// - 단, 숫자가 아닌 문자열이 전달되면 예외
		
		System.out.println("n1 + n2 = " + (n1 + n2) + "\n");
		
		
		// 정수 -> 문자열
		str1 = Integer.toString(3541);
		str2 = Integer.toString(8385);
		// String toString(int i)
		// - 전달한 정수를 문자열로 바꿔서 리턴
		
		System.out.println("str1 + str2 = " + (str1 + str2) + "\n");
		
		
		
		// ※ 정수 -> 문자열을 좀 더 쉽게 하는 법
		String str3 = "" + 10 + 13;
		String str4 = 10 + 13 + "";
		
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		
		
		// ※ 문자열 -> 실수
		double pi = Double.parseDouble("3.141592");
		
		System.out.println("pi = " + pi);
	}
}
