package chapter01_fundamentals.part01.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_13 {

	/**
	 * @Title: matrixTranspose 
	 * @Description: 二维数组转置输出  交换行与列  
	 * @param array 二维数组
	 * @param M 二维数组行数
	 * @param N 二维数组列数
	 * @see Q_1_1_11  二维数组的遍历不同可以由对于行列遍历的先后次序的不同而实现
	 * 	1. 先遍历行，再对每一行的列数进行遍历属于二维数组的正常遍历
	 * 	2. 先遍历列，再对每一列的行数进行遍历属于二维数组的转置遍历
	 * 	
	 * 	attention array[i][j] 第一个参数表示行数 第二个参数表示列数
	 */
	public static void matrixTranspose(int[][] array, int M, int N) {
		//先读取一列，再读取该列每一行，直至下一列
		for (int j = 0; j < N; j++) {	// 列遍历
			for (int i = 0; i < M; i++) { // 行遍历
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
