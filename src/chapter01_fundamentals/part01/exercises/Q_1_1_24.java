package chapter01_fundamentals.part01.exercises;

import edu.princeton.cs.algs4.StdIn;

public class Q_1_1_24 {

	public static void main(String[] args) {
		int p = StdIn.readInt();
		int q = StdIn.readInt();
		gcd(p, q);
	}
	
	/**
	  * 欧几里得法求最大公约数， 非递归方式实现
	  * f(a, b) = f (a , a mod b);
	  * 始终保持 p > q
	  * 若 p % q == 0，则q是最大公约数	
	  * @param p
	  * @param q
	 */
	public static void euclid(int p, int q) {
		while (p % q != 0) {
			if (p < q) {
				p = p + q;
				q = p - q;
			}
			p = p % q;
		}
		System.out.println(q);
	}
	
	/**
      * 使用递归方式，实现求解最大公约数  
      * 注意p与q大小的判断
	  * @param p
	  * @param q
	 */
	public static void euclid2(int p, int q) {
		System.out.println("p:" + p + " " + "q:" + q);
		if (p % q == 0) {
			System.out.println(q);
		} else if (p % q > p) {
			euclid(p % q, q);
		} else {
			euclid(p, q % p);
		}
	}
	
	/**
	  * @Title: gcd
	  * @Description: 书中方式
	  * @author: xuwenping
	  * @date: 2017年11月3日
	  * @param p
	  * @param q
	 */
	public static void gcd(int p, int q) {
		if (q == 0) {
			System.out.println(q);
		}
		int r = p % q;
		gcd(q, r);
	}
}
