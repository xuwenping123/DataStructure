package chapter01_fundamentals.part01.exercises;

import edu.princeton.cs.algs4.StdIn;

public class Q_1_1_3 {

	public static void main(String[] args) {
		int a, b, c;
		a = StdIn.readInt();
		b = StdIn.readInt();
		c = StdIn.readInt();
		if (a == b && a == c) {
			System.out.println("equal");
			return;
		} 
		System.out.println("not equal");
	}
}
