package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_7 {

	public static void test1() {
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001) {
			t = (9.0 / t + t) / 2.0;
			StdOut.printf("%.5f\n", t);
		}
	}
}
