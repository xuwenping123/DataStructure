package chapter01_fundamentals.part03.stack;

import java.util.Iterator;

/**
 * @ClassName: ResizingArraysStack 
 * @Description: see P 88, ��ѹջ(LIFO)   �ܹ���̬���������С��ʵ��
 * @author xuwenping
 * @date 2017��11��18�� ����9:32:22 
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
	 * @Description: �ڲ��࣬���ⲿ��ʹ��foreach���������������в������޸�����
	 * @author xuwenping
	 * @date 2017��11��18�� ����9:36:09 
	 * @version V1.0
	 */
	private class ReverseArrayIterator implements Iterator<Item> {

		private int i = N;// ������ֱ��ʹ��N,��Ϊ����ʹ�õ����������޸�����
		
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
			//Ϊ��ֹ�ڵ��������и������飬����������ɾ��
		}
		
	}
}
