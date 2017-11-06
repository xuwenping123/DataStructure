package chapter01_fundamentals.part01.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_13 {

	/**
	 * @Title: matrixTranspose 
	 * @Description: ��ά����ת�����  ����������  
	 * @param array ��ά����
	 * @param M ��ά��������
	 * @param N ��ά��������
	 * @see Q_1_1_11  ��ά����ı�����ͬ�����ɶ������б������Ⱥ����Ĳ�ͬ��ʵ��
	 * 	1. �ȱ����У��ٶ�ÿһ�е��������б������ڶ�ά�������������
	 * 	2. �ȱ����У��ٶ�ÿһ�е��������б������ڶ�ά�����ת�ñ���
	 * 	
	 * 	attention array[i][j] ��һ��������ʾ���� �ڶ���������ʾ����
	 */
	public static void matrixTranspose(int[][] array, int M, int N) {
		//�ȶ�ȡһ�У��ٶ�ȡ����ÿһ�У�ֱ����һ��
		for (int j = 0; j < N; j++) {	// �б���
			for (int i = 0; i < M; i++) { // �б���
				StdOut.println(array[i][j]);
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
