package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_13 {

	/**
	 * @Title: matrixTranspose 
	 * @Description: 二维数组转置输出  交换行与列  
	 * @param array 二维数组
	 * @param M 二维数组行数
	 * @param N 二维数组列数
	 */
	public static void matrixTranspose(int[][] array, int M, int N) {
		for (int i = 0; i < M; i++) { // 行数
			for (int j = 0; j < N; j++) { // 列数
				StdOut.println(array[j][i]); // 每次先遍历同一列数，再向下读一行
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
