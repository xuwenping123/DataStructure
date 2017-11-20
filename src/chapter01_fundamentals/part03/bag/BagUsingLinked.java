package chapter01_fundamentals.part03.bag;

import java.util.Iterator;

/**
 * @ClassName: BagUsingLinked 
 * @Description: ����ʵ�ֵı�����ֻ���������ӱ�β��
 * @author xuwenping
 * @date 2017��11��20�� ����10:02:14 
 * @version V1.0
 * @param <Item>
 */
public class BagUsingLinked<Item> extends Bag<Item>{

	private Node first;
	private int N;
	
	@Override
	public Iterator<Item> iterator() {
		return new MyIterator();
	}

	@Override
	public void add(Item item) {
		Node node = new Node(item);
		node.next = first;
		first = node;
		N++;
	}

	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public int size() {
		return N;
	}

	/**
	 * @ClassName: Node 
	 * @Description: ������
	 * @author xuwenping
	 * @date 2017��11��20�� ����10:04:56 
	 * @version V1.0
	 */
	private class Node {
		Node next;
		Item item;
		
		public Node(Item item) {
			this.item = item;
			this.next = null;
		}
	}
	
	/**
	 * @ClassName: MyIterator 
	 * @Description: ������ʵ��
	 * @author xuwenping
	 * @date 2017��11��20�� ����10:13:31 
	 * @version V1.0
	 */
	private class MyIterator implements Iterator<Item> {
		
		private Node current = first;
		
		@Override
		public boolean hasNext() {
			return current.next == null;
		}

		@Override
		public Item next() {
			current = current.next;
			return current.item;
		}

		@Override
		public void remove() {
			// �������������ĸı�
		}
	}
}
