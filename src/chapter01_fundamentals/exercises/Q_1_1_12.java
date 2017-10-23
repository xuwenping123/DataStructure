package chapter01_fundamentals.exercises;


public class Q_1_1_12 {
	
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = 9 - i; // a[i] 值依次是:   9 8 7 6 5 4 3 2 1 0
		}
		for (int i = 0; i < 10; i++) {
			a[i] = a[a[i]]; // a[i] 值依次是: 0 1 2 3 4 5 6 7 8 9
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i); // println: 0 1 2 3 4 5 6 7 8 9 
		}
	}
}
