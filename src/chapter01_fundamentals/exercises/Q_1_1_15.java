package chapter01_fundamentals.exercises;

import chapter01_fundamentals.ArrayOperation;

public class Q_1_1_15 {

	public static int[] histogram(int[] a, int M) {
		/**
		 * 两种方式： 
		 * 1. 针对于0 ~ (M - 1) => i每个元素在a[j]中遍历一次，如果相等，array[i]++， 最后返回array[]，时间复杂度 a.length * M
		 * 2. 针对于a[i]中的每个元素，若是在 0 ~ (M - 1) => j中，array[i]++，最后返回array[]， 时间复杂度为a.length 
		 */
		int[] array = new int[M];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= M) {
				continue;
			}
			array[a[i]]++;
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] a = {};
		int[] array = histogram(a, 5);
		ArrayOperation.printArray(array);
	}
}
