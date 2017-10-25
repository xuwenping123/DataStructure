package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_20 {

	/**
	 * ʹ�÷ǵݹ鷽ʽ��ȡN�������Math.log(N!)
	 */
	public static double lnN(int N) {
		long factorial = factorial(N);
		return Math.log(factorial);
	}
	
	/**
	 * ����׳�
	 */
	public static long factorial(int N) {
		if (N == 0) {
			return 1;
		}
		long mul = 1;
		do {
			mul *= N;
		} while (N-- > 1);
		return mul;
	}
 	
	public static void main(String[] args) {
		StdOut.println(lnN(10));
		StdOut.println(lnN2(10));
	}
	
	/** 
	 *  �ݹ鷽ʽʵ�֣�
	 *  �ݹ��ϵʽ�� 	ln(N!) = ln(N) + ln(N-1) + ln(N-2) + ... + ln(2) + ln(1);
	 */
	public static double lnN2(int N) {
		if (N == 0) {
			return Math.log(1);
		}
		if (N == 1) {
			return Math.log(1);
		}
		return Math.log(N) + lnN2(N - 1);
	}
}
