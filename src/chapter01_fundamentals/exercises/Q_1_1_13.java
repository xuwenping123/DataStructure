package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_13 {

	/**
	 * @Title: matrixTranspose 
	 * @Description: ��ά����ת�����  ����������  
	 * @param array ��ά����
	 * @param M ��ά��������
	 * @param N ��ά��������
	 */
	public static void matrixTranspose(int[][] array, int M, int N) {
		for (int i = 0; i < M; i++) { // ����
			for (int j = 0; j < N; j++) { // ����
				StdOut.println(array[j][i]); // ÿ���ȱ���ͬһ�����������¶�һ��
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] array = {
				{12, 34, 54, 123},
				{23, 52, 45, 67},
				{18, 76, 34, 23}
		};
		matrixTranspose(array, 3, 4);
	}
}
