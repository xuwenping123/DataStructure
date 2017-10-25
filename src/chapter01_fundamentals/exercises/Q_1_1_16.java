package chapter01_fundamentals.exercises;

public class Q_1_1_16 {

	public static String exR1(int n) {
		if (n <= 0) {
			return "";
		}
		// Î²µÝ¹é 
		// µÝ¹éÊ±¼ä¸´ÔÓ¶È¼ÆËã: http://www.cnblogs.com/python27/archive/2011/12/09/2282486.html
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}
	
	public static void main(String[] args) {
		System.out.println(exR1(6));
		// out: "311361142246"
	}
}
