package chapter01_fundamentals.exercises;

public class Q_1_1_14 {

	/**
	  * @Title: lg
	  * @Description: 输入正整数 N ，返回 不大于 log(2)N的最大正整数
	  * @author: xuwenping
	  * @date: 2017年10月24日
	  * @param N
	  * @return 
	 */
	public static int lg(int N) {
		int result = 0;
		while (N >= 2) {
			// N / 2 => N >>> 1   无符号右移
			// N * 2 => N << 1
			// 取N的每位数值	N & (11...111)
			N >>>= 1;
			result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(lg(1025));
	}
	
	/**
	 * test case:
	 * 
	 * 1 2 3 4 1024 1025
	 */
}
