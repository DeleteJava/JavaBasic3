package wrapper;

class Point<T> {
	T x, y;

	Point(T x, T y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Point<Integer> p1 = new Point<Integer>(5, 2);
		Point<Double> p2 = new Point<Double>(3.14, 1.3);
		Point<Boolean> p3 = new Point<Boolean>(true, false);
		Point<String> p4 = new Point<String>("쉬었다", "합시다");
		
		
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);
		System.out.println("p4 = " + p4);
	}
}
