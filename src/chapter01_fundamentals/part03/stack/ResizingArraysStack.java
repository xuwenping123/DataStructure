package chapter01_fundamentals.part03.stack;

import java.util.Iterator;

/**
 * @ClassName: ResizingArraysStack 
 * @Description: see P 88, 下压栈(LIFO)   能够动态调整数组大小的实现
 * @author xuwenping
 * @date 2017年11月18日 下午9:32:22 
 * @version V1.0
 * @param <Item>
 */
public class ResizingArraysStack<Item> extends Stack<Item> implements Iterable<Item> {

	private Item[] a;
	private int N;
	
	@SuppressWarnings("unchecked")
	public ResizingArraysStack(int cap) {
		a = (Item[]) new Object[cap];
	}
	
	@Override
	public void push(Item item) {
		if (N == a.length) {
			resize(a.length * 2);
		}
		a[N++] = item;
	}

	@Override
	public Item pop() {
		Item item = a[--N];
		if (N == a.length / 4 && N > 0) {
			resize(a.length / 2);
		}
		return item;
	}

	@SuppressWarnings("unchecked")
	private void resize(int max) {
		Item[] b = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			b[i] = a[i];
		}
		a = b;
	}
	
	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	/**
	 * @ClassName: ReverseArrayIterator 
	 * @Description: 内部类，是外部类使用foreach迭代，迭代过程中不允许修改数据
	 * @author xuwenping
	 * @date 2017年11月18日 下午9:36:09 
	 * @version V1.0
	 */
	private class ReverseArrayIterator implements Iterator<Item> {

		private int i = N;// 不可以直接使用N,因为仅仅使用迭代，而不修改数据
		
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return a[--i];
		}

		@Deprecated
		@Override
		public void remove() {
			//为防止在迭代过程中更改数组，不进行数据删除
		}
		
	}
}
