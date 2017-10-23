package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdIn;

public class Q_1_1_5 {

	public static void main(String[] args) {
		double a, b;
		a = StdIn.readDouble();
		b = StdIn.readDouble();
		if (0 <= a && a <= 1 && 0 <= b && b <= 1) {
			System.out.println("true");
			return;
		}
		System.out.println("false");
	}
}
