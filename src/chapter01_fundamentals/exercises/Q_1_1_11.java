package chapter01_fundamentals.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_11 {

	public static void printBoolArray(boolean[][] array) {
		char temp;
		for (int i = 0; i < array.length; i++) { // 列遍历
			for (int j = 0; j < array[i].length; j++) { //行遍历
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
