package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_11 {

	public static void printBoolArray(boolean[][] array) {
		// 先读取一行，然后读取该行的所有列，再读取下一行
		char temp;
		for (int i = 0; i < array.length; i++) { // 行遍历
			for (int j = 0; j < array[i].length; j++) { //列遍历
				temp = array[i][j] == true ? '*' : ' ';
				StdOut.println("Row: " + j + " col: " + i + " [" + temp + "]");
			}
		}
	}
	
	public static void main(String[] args) {
		boolean[][] array = { 
								{true, true, false, false}, 
								{false, false, true, false},
								{true, false, true, false}
							};
		printBoolArray(array);
	}
}
