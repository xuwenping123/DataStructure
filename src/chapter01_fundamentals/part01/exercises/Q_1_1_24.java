package chapter01_fundamentals.part01.exercises;

import edu.princeton.cs.algs4.StdIn;

public class Q_1_1_24 {

	public static void main(String[] args) {
		int p = StdIn.readInt();
		int q = StdIn.readInt();
		gcd(p, q);
	}
	
	/**
	  * ŷ����÷������Լ���� �ǵݹ鷽ʽʵ��
	  * f(a, b) = f (a , a mod b);
	  * ʼ�ձ��� p > q
	  * �� p % q == 0����q�����Լ��	
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
      * ʹ�õݹ鷽ʽ��ʵ��������Լ��  
      * ע��p��q��С���ж�
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
	  * @Description: ���з�ʽ
	  * @author: xuwenping
	  * @date: 2017��11��3��
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
