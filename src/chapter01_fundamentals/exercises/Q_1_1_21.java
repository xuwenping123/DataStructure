package chapter01_fundamentals.exercises;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q_1_1_21 {

	public static void test() {
		StdOut.println("���������������� ");
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
			StdOut.print((i + 1) + "\t" + record.getName() + "\t" + record.num1 + "\t" + record.num2 + "\t" + round(record.rate, 3));
		}
		StdOut.println();
	}
	
	/**
	  * @Title: round
	  * @Description: ��ֵ���ȿ���
	  * @author: xuwenping
	  * @date: 2017��10��25��
	  * @param v	��Ҫ���ƾ��ȵ���ֵ
	  * @param scale  С��λ��
	  * @return	
	 */
	public static float round(float v, int scale) { 
		if (scale < 0) { 	
			return v;
		} 
		if(v == 0d || (v + "").equals("NaN")){
			return 0;
		}
		BigDecimal b = new BigDecimal(Float.toString(v)); 
		return b.setScale(scale, BigDecimal.ROUND_HALF_UP).floatValue(); 
	} 
	
	public static void main(String[] args) {
		test();
	}
}

/**
 * ʹ�ö��󣬴洢���� 
 */
class Record {
	String name;
	int num1;
	int num2;
	float rate;
	
	public Record(String name, int num1, int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
		this.rate = 1.0f * num1 / num2;
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
