package chapter01_fundamentals.exercises;

public class Q_1_1_18 {

	public static int mystery(int a, int b) {
		if (b == 0) {
			return 0;
		}
		if (b % 2 == 0) {
			return mystery(a + a, b / 2);
		}
		return mystery(a + a, b / 2) + a;
	}

	/**
	  * @Title: result
	  * @Description: 基于上述递归，使用循环重新编写实现
	  * @author: xuwenping
	  * @date: 2017年10月25日
	  * @param a
	  * @param b
	  * @return
	 */
	public static int result(int a, int b) {
		int sum = 0;
		while (b > 0) {
			if (b % 2 != 0) {
				sum += a;
			}
			b /= 2;
			a += a;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(mystery(2, 25)); // print 50
		System.out.println(result(2, 25));	// print 50
		System.out.println(mystery(3, 11)); // print 33
		System.out.println(result(3, 11));  // print 33
	}
	
}
