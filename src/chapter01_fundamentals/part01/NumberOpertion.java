package chapter01_fundamentals.part01;

/**
 * @ClassName: NumberOpertion 
 * @Description: �������ֵĻ�������������p13
 * @author xuwenping
 * @date 2017��10��9�� ����11:02:56 
 * @version V1.0
 */
public class NumberOpertion {

	private static void checkValue(Object ...object) {
		//check object value 
	}
	
	/**
	 * @Title: abs 
	 * @Description: ��ȡ���־���ֵ
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
	 * @Description: ��ȡ���־���ֵ
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
	 * @Description: �ж�һ�����Ƿ�������
	 * @param num
	 * @return boolean 
	 * 		true ��ʾ������ 	false ��ʾ��������
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
	 * @Description: ţ�ٵ�������ƽ����  ����ţ�ٵ�������Լ���ƹ�ʽ�� x(next) ~ (x - a / x) / 2
	 * @param num ��������
	 * @param e	����
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
	 * @Description: ���ַ���ƽ����, ȡ�м�ֵ���д�С�Ƚ��Լ��ȽϽ�����������޶����ظ�����ֱ���ﵽ����Ϊֹ
	 * @param num ��������
	 * @param e ����
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
	 * @Description: ��������б�߳��ȣ������ţ�,�˴�����Math.sqrt()������
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
	 * @Description: ������ͼ���  1 + 1 / 2 + 1 / 3 + 1 / 4 + ������ + 1 / (N - 1) + 1 / N;
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
	 * @Description: ������������ֵ����ʹ�õ���������������ʱ�洢, @see Q_1_1_6.java
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
