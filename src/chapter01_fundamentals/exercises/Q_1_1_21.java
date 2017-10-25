package chapter01_fundamentals.exercises;

import java.util.ArrayList;
import java.util.List;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_21 {

	public static void test() {
		StdOut.println("请输入数据行数： ");
		int times = StdIn.readInt();
		List<Record> list = new ArrayList<Record>(times);
		String name;
		int num1, num2;
		while (times-- > 0) {
			name = StdIn.readString();
			num1 = StdIn.readInt();
			num2 = StdIn.readInt();
			list.add(new Record(name, num1, num2));
		}
		println(list);
	}
	
	public static void println(List<Record> list) {
		StdOut.println("lineNum \t name \t num1 \t num2 \t rate");
		Record record;
		for (int i = 0; i < list.size(); i++) {
			record = list.get(i);
			StdOut.print(record.getName() + "\t" + record.num1 + "\t" + record.num2 + "\t" + record.rate);
		}
	}
}

class Record {
	String name;
	int num1;
	int num2;
	float rate;
	
	public Record(String name, int num1, int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
		this.rate = Math.scalb((float)num1 / num2, 3);
	}

	public String getName() {
		return name;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public float getRate() {
		return rate;
	}
}
