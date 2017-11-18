package chapter01_fundamentals.part01.exercises;

public class Q_1_1_26 {

	public static void main(String[] args) {
		sort(235, 2, 24);
	}

	/*
	 * 对于类型的泛型失败
	 */
	public static <T extends Number> void sort(T a, T b, T c) {
//		T t;
	}
	
	public static void sort(int a, int b, int c) {
		int t;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		} 
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		System.out.println(a + "  " + b + "  " + c);
	}
}
