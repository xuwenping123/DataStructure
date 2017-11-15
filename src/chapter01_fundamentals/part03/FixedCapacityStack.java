package chapter01_fundamentals.part03;

/**
 * @ClassName: FixedCapacityStack 
 * @Description: see p84, 一种表示泛型定容栈的抽象数据类型
 * @author xuwenping
 * @date 2017年11月15日 下午9:20:04 
 * @version V1.0
 */
public class FixedCapacityStack<Item> {

	private Item[] a;
	private int N;
	
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int cap) {
		a = (Item[]) new Object[cap];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item) {
		
		a[N++] = item;
	}
	
	public Item pop() {
		return a[--N];
	}
}
