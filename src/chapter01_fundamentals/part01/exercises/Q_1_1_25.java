package chapter01_fundamentals.part01.exercises;

/**
  * @ClassName: Q_1_1_25
  * @Description: ֤��ŷ������㷨�ܹ���ȡ�������������Լ��
  * @author:xuwenping
  * @date: 2017��11��3��
  * @version V1.0
 */
public class Q_1_1_25 {
	
	/*
	 * 1. input a < b
	 * 2. �����������a b ���У� b = a * i + c => c = b - a * i  �� i ȡ��ȡ�����ֵ��
	 * 3. ���� a b �����Լ��Ϊk, �� c/k = b/k - (a * i)/k
	 * 	  ��  c Ҳ�ܱ�k����
	 * 4. c <= a, c <= b, ��С��ֵ���жϷ�Χ
	 * 5. ��gcd(a, b) = gcd(a, b mod a);
	 * 
	 * 
	 * ��һ��ʼ��Ϊ��������֤��ŷ������㷨����ȷ�ԣ���������������Ǹо���k�� a c �Ĺ�Լ�������ǲ���֤�� k �� a c�����Լ��
	 * 
	 * @see http://blog.csdn.net/flpanbin/article/details/51860902
	 * 
	 * ��֤������:
	 * 
	 * 1. input a > b
	 * 2. c = gcd(a, b) => a = nc, b = mc;
	 * 3. r = a - b * i => r = nc - mic = c(n - im) => cҲ��r��һ����Լ��
	 * 4. Ҫ֤�� b=mc, r=c(n -im) �����Լ���� c,��֤��m �� n -im ����
	 * 5. ��m n-im�����ʣ������һ��d(d > 1)������ m = xd, n-im = yd;
	 * 6. �� a = nc = c(yd + im) = c(yd + ixd) = cd(y + ix);
	 * 	    b = mc = xdc; 
	 * 7. �� a b�����Լ��Ϊ cd(d>1),����費����
	 * 8. ��֤��
	 * 
	 * ��ѧ���ɷ�
	 */
}
