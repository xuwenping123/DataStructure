package chapter01_fundamentals.part01.exercises;

public class Q_1_1_10 {

	public static void main(String[] args) {
		int[] a;
		for (int i = 0; i < 10; i++) {
			//a[i] = i * i;  编译失败！a[i]数组未进行初始化  
			a = new int[10];
			System.out.println(a);
		}
	}
}
