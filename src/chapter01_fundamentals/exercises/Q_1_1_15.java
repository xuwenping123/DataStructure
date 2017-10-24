package chapter01_fundamentals.exercises;

import chapter01_fundamentals.ArrayOperation;

public class Q_1_1_15 {

	public static int[] histogram(int[] a, int M) {
		/**
		 * ���ַ�ʽ�� 
		 * 1. �����0 ~ (M - 1) => iÿ��Ԫ����a[j]�б���һ�Σ������ȣ�array[i]++�� ��󷵻�array[]��ʱ�临�Ӷ� a.length * M
		 * 2. �����a[i]�е�ÿ��Ԫ�أ������� 0 ~ (M - 1) => j�У�array[i]++����󷵻�array[]�� ʱ�临�Ӷ�Ϊa.length 
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
