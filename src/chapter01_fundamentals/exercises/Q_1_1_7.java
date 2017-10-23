package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_7 {

	public static void test1() {
		// 牛顿迭代法求解平方根  
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001) {
			t = (9.0 / t + t) / 2.0;
			StdOut.printf("%.5f\n", t);
		}
	}
	
	public static void test2() {
		//sum = 0 + 1 + 2 + 3 + ... + 999
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		StdOut.println(sum);
	}
	
	
	public static void test3() {
		// sum = 1000( log2(1000))
		int sum = 0;
		for (int i = 1; i < 1000; i *= 2) {
			for (int j = 0; j < 1000; j++) {
				sum++;
			}
		}
		StdOut.println(sum);
	}
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
}
