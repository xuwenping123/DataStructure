package chapter01_fundamentals.exercises;

public class Q_1_1_17 {

	/*
	 *  Exception in thread "main" java.lang.StackOverflowError
	 *  
	 *  Õ»Òç³ö
	 */
	public static String exR2(int n) {
		String s = exR2(n - 3) + n + exR2(n - 2) + n;
		if (n <= 0) {
			return "";
		}
		return s;
	}
	
	public static void main(String[] args) {
		exR2(3);
	}
}
