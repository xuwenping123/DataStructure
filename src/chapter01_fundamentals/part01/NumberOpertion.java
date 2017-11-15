package chapter01_fundamentals.part01;

/**
 * @ClassName: NumberOpertion 
 * @Description: 关于数字的基本操作，见书p13
 * @author xuwenping
 * @date 2017年10月9日 下午11:02:56 
 * @version V1.0
 */
public class NumberOpertion {

	private static void checkValue(Object ...object) {
		//check object value 
	}
	
	/**
	 * @Title: abs 
	 * @Description: 获取数字绝对值
	 * @param num
	 * @return int
	 */
	public static int abs(int num) {
		if (num < 0) {
			num *= (-1);
		}
		return num;
	}
	
	/**
	 * @Title: abs 
	 * @Description: 获取数字绝对值
	 * @param num
	 * @return double
	 */
	public static double abs(double num) {
		if (num < 0) {
			num *= (-1);
		}
		return num;
	}
	
	/**
	 * @Title: isPrime 
	 * @Description: 判断一个数是否是素数
	 * @param num
	 * @return boolean 
	 * 		true 表示是素数 	false 表示不是素数
	 */
	public static boolean isPrime(int num) {
		checkValue(num);
		if (num < 2) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num / i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @Title: sqrtNewton 
	 * @Description: 牛顿迭代法求平方根  依据牛顿迭代法有约递推公式： x(next) ~ (x - a / x) / 2
	 * @param num 被开方数
	 * @param e	精度
	 * @return double 
	 */
	public static double sqrtNewton(double num, double e) {
		checkValue(num);
		double guess = num / 2;
		while (abs(guess * guess - num) > e) {
			guess = (guess - num / guess) / 2;
		}
		return guess;
	}
	
	/**
	 * @Title: sqrt 
	 * @Description: 二分法求平方根, 取中间值进行大小比较以及比较结果进行区间限定，重复过程直至达到精度为止
	 * @param num 被开方数
	 * @param e 精度
	 * @return double
	 */
	public static double sqrt(double num, double e) {
		checkValue(num);
		double start = 0.0;
		double end = num;
		double guess = (start + end) / 2;
		while (abs(guess * guess - num) > e) {
			if (guess * guess < num) {
				start = guess;
			} else {
				end = guess;
			}
			guess = (start + end) / 2;
		}
		return guess;
	}
	
	public static void main(String[] args) {
		double temp = hypotenuse(3.0, 4.0);
		System.out.println(temp);
	}
	
	/**
	 * @Title: hypotenuse 
	 * @Description: 求三角形斜边长度（开根号）,此处采用Math.sqrt()工具类
	 * @param a
	 * @param b
	 * @return double
	 */
	public static double hypotenuse(double a, double b) {
		checkValue(a, b);
		return Math.sqrt(a * a + b * b);
	}
	
	/**
	 * @Title: H 
	 * @Description: 计算调和级数  1 + 1 / 2 + 1 / 3 + 1 / 4 + ··· + 1 / (N - 1) + 1 / N;
	 * @param num
	 * @return double
	 */
	public static double H(int num) {
		double sum = 0.0;
		for (int i = 0; i < num; i++) {
			//care double 
			sum += 1.0 / i;
		}
		return sum;
	}
	
	/**
	 * @Title: swap 
	 * @Description: 交换两个数的值，不使用第三方变量进行临时存储, @see Q_1_1_6.java
	 * @param a
	 * @param b void
	 */
	public static void swap(int a, int b) {
		checkValue(a, b);
		a = a + b;
		b = a - b;
		a = a - b;
	}
}
