package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_6 {

	/**
	 * answer
	 * 
	0
	1
	1
	2
	3
	5
	8
	13
	21
	34
	55
	89
	144
	233
	377
	610
	 */
	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
	
	/**
	 * @Title: swapTwoNum 
	 * @Description: 基于两个数的和、差实现的两者交换，不需要第三方变量进行数据临时保存
	 */
	public static void swapTwoNum() {
		int a = 12;
		int b = 22;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}
}
