package chapter01_fundamentals;

/**
  * @ClassName: CalculationSqrt
  * @Description: ����ʵ����ƽ����
  * @author:xuwenping
  * @date: 2017��10��10��
  * @version V1.0
 */
public class CalculationSqrt {

	private static void checkData(Object object) {
		//check object value
	}
	
	/**
	  * @Title: sqrt
	  * @Description: ʹ�ö��ַ����ƽ����
	  * @author: xuwenping
	  * @date: 2017��10��10��
	  * @param num ��������
	  * @param e ���ֵ
	 */
	public static void sqrt(double num, double e) {
		checkData(num);
		double start = 0.0;
		double end = num;
		double guess = (start + end) / 2;
		double value = guess * guess;
		int count = 1;
		while (abs(num - value) > e) {
			System.out.println("num = " + num + " guess = " + guess + " guess * guess = " + guess * guess + " e = " + e);
			if (num > value) {
				start = guess;
			} else if (num < value) {
				end = guess;
			}
			guess = (start + end) / 2;
			value = guess * guess;
			count++;
		}
		System.out.println("----------------------------");
		System.out.println(count);
		System.out.println("num = " + num + " guess = " + guess + " guess * guess = " + guess * guess + " e = " + e);
	}
	
    private static float sqrt(float num, float e) {
        float low = 0F;
        float high = num;
        float guess, e0;
        int count = 0;
        do {
               guess = (low + high) / 2;
               if (guess*guess > num) {
                     high = guess;
                     e0 = guess*guess - num;
               } else {
                     low = guess;
                     e0 = num - guess*guess;
               }
               count++;
               System.out.printf("Try %f, e: %f\n", guess, e0);
        } while (e0 > e);
        System.out.printf("Try %d times, result: %f\n", count, guess);
        return guess;
    }

	public static void main(String[] args) {
		sqrt(2.0f, 0.01f);
	}
	
	public static double abs(double num) {
		if (num < 0) {
			num *= (-1);
		}
		return num;
	}
	
	/**
	  * @Title: sqrtNewton
	  * @Description: ţ�ٵ�������ƽ����
	  * @author: xuwenping
	  * @date: 2017��10��10��
	  * @param num
	  * @param e
	  * @return
	 */
    private static float sqrtNewton(float num, float e) {
        float guess = num / 2;
        float e0;
        int count = 0;
        do {
               guess = (guess + num / guess) / 2;
               e0 = guess * guess - num;
               count++;
               System.out.printf("Try %f, e: %f\n", guess, e0);
        } while (e0 > e);
        System.out.printf("Try %d times, result: %f\n", count, guess);
        return guess;
    }
}
