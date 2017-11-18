package chapter01_fundamentals.part03.stack;

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
		//新增扩容操作
		if (N == a.length) {
			resize(a.length * 2);
		}
		a[N++] = item;
	}
	
	public Item pop() {
		Item item = a[--N];
		//新增缩容操作
		a[N] = null;//避免对象游离
		if (N == a.length / 4 && N > 0) {
			resize(a.length / 2);
		}
		return a[--N];
	}
	
	/**
	 * @Title: resize 
	 * @Description: 改变数组容量大小，确保数组容量使用率在25% ~ 100% 之间
	 * @param size void
	 */
	@SuppressWarnings("unchecked")
	private void resize(int size) {
		Item[] b = (Item[]) new Object[size];
		for (int i = 0; i < N; i++) {
			b[i] = a[i];
		}
		a = b;
	}
}
