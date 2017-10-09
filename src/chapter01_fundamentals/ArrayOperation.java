package chapter01_fundamentals;

/**
 * @ClassName: ArrayOperation 
 * @Description: ���͵��������������p11
 * @author xuwenping
 * @date 2017��10��9�� ����10:14:37 
 * @version V1.0
 */
public class ArrayOperation {
	
	/**
	 * @Title: checkArray 
	 * @Description: У������ֵ
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
	 * @Description: ��ȡ�������ֵ
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
	 * @Description: ��ȡ����ƽ��ֵ
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
	 * @Description: �������鿽��
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
	 * @Description: ��ת���飨��ʵ������ķ�ת��δ���Ǵ�ֵ�������⣩
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
	 * @Description: ����a[][] * b[][]����˻�������
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
