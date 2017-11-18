package chapter01_fundamentals.part03.stack;

/**
 * @ClassName: FixedCapacityStackOfStrings 
 * @Description: p82， 一种表示定容字符串栈的抽象数据结构类型
 * @author xuwenping
 * @date 2017年11月15日 下午9:12:46 
 * @version V1.0
 */
public class FixedCapacityStackOfStrings {

	private String[] a;
	private int N;
	
	public FixedCapacityStackOfStrings(int cap) {
		a = new String[cap];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void push(String item) {
		a[N++] = item;
	}
	
	public String pop() {
		return a[--N];
	}
}
