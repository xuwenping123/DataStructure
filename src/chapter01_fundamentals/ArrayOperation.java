package chapter01_fundamentals;

/**
 * @ClassName: ArrayOperation 
 * @Description: 典型的数组操作，见书p11
 * @author xuwenping
 * @date 2017年10月9日 下午10:14:37 
 * @version V1.0
 */
public class ArrayOperation {
	
	/**
	 * @Title: checkArray 
	 * @Description: 校验数组值
	 * @param array 
	 */
	private static void checkArray(double[] array) {
		//check array value is null or size == 0
	}
	
	private static void checkArray(double[][] array) {
		//check array value is null or size == 0
	}
	
	/**
	 * @Title: getArrayMaxValue 
	 * @Description: 获取数组最大值
	 * @param array
	 * @return double
	 */
	public static double getArrayMaxValue(double[] array) {
		checkArray(array);
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	/**
	 * @Title: getArrayAverageValue 
	 * @Description: 获取数组平均值
	 * @param array
	 * @return double
	 */
	public static double getArrayAverageValue(double[] array) {
		checkArray(array);
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
	
	/**
	 * @Title: getCopyArray 
	 * @Description: 进行数组拷贝
	 * @see System.arraycopy()
	 * @param array
	 * @return double[]
	 */
	public static double[] getCopyArray(double[] array) {
		checkArray(array);
		double[] anoArray = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			anoArray[i] = array[i];
		}
		return anoArray;
	}
	
	/**
	 * @Title: reversalArray 
	 * @Description: 反转数组（仅实现数组的反转，未考虑传值引用问题）
	 * @param array 
	 */
	public static void reversalArray(double[] array) {
		checkArray(array);
		double temp;
		int length = array.length;
		for (int i = 0; i < length; i++) {
			temp = array[length - i -1];
			array[length - i - 1] = array[i];
			array[i] = temp;
		}
	}
	
	/**
	 * @Title: getMatrixProduct 
	 * @Description: 计算a[][] * b[][]矩阵乘积（方阵）
	 * @param a
	 * @param b
	 * @return double[][]
	 */
	public static double[][] getMatrixProduct(double[][] a, double[][] b) {
		checkArray(a);
		checkArray(b);
		int length = a.length;
		double[][] c = new double[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				for (int k = 0; k < length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
 }
