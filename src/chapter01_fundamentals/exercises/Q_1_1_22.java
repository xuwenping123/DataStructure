package chapter01_fundamentals.exercises;

public class Q_1_1_22 {
	
	public static void main(String[] args) {
		int key = 2;
		int[] a = {-2, -1, 2, 7, 9, 45, 60, 123};
		System.out.println(rank(key, a, 0, a.length - 1, 1));
	}
	
	public static int rank(int key, int[] a, int lo, int hi, int deep) {
		System.out.println("lo:" + lo + " hi:" + hi + " deep:" + deep);
		if (lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2; // 与mid = (a + b) / 2 的这种方式有区别？
		if (key < a[mid]) {
			return rank(key, a, lo, mid - 1, deep + 1);
		}else if (key > a[mid]) {
			return rank(key, a, mid + 1, hi, deep + 1);
		}
		return mid;
	}
}

/**
 * 使用递归方式实现的二分查找
 */
class BinarySearch {
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}
	
	private static int rank(int key, int[] a, int lo, int hi) {
		if (lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) {
			return rank(key, a, lo, mid - 1);
		} else if (key > a[mid]) {
			return rank(key, a, mid + 1, hi);
		} else {
			return mid;
		}
	}
}
