package chapter01_fundamentals.exercises;

public class Q_1_1_14 {

	/**
	  * @Title: lg
	  * @Description: ���������� N ������ ������ log(2)N�����������
	  * @author: xuwenping
	  * @date: 2017��10��24��
	  * @param N
	  * @return 
	 */
	public static int lg(int N) {
		int result = 0;
		while (N >= 2) {
			// N / 2 => N >>> 1   �޷�������
			// N * 2 => N << 1
			// ȡN��ÿλ��ֵ	N & (11...111)
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
