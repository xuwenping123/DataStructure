package chapter01_fundamentals.part03.queue;

import java.util.Iterator;

/**
 * @ClassName: QueueUsingLinked 
 * @Description: ���У� �Ƚ��ȳ��� �ӱ�β�����ӱ�ͷ��
 * @author xuwenping
 * @date 2017��11��20�� ����9:46:34 
 * @version V1.0
 * @param <Item>
 */
public class QueueUsingLinked<Item> extends Queue<Item>{

	private Node first;
	private Node last;
	private int N;
	
	@Override
	public Iterator<Item> iterator() {

		return new MyIterator();
	}

	@Override
	public void enqueue(Item item) {
		Node node = new Node(item);
		Node oldLast = last;
		last = node;
		if (isEmpty() == true) {
			first = last;
		} else {
			oldLast.next = last;
		}
		N++;
	}

	@Override
	public Item dequeue() {
		Node node = first;
		if (isEmpty() == true) {
			first = last;
		} else {
			first = first.next;
		}
		N--;
		return node.item;
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
	 * @Description: �ڲ��࣬��ʾ����Ľ��
	 * @author xuwenping
	 * @date 2017��11��20�� ����9:45:19 
	 * @version V1.0
	 */
	private class Node {
		Node next;
		Item item;
		
		public Node(Item item) {
			this.item = item;
			next = null;
		}
	}
	
	/**
	 * @ClassName: MyIterator 
	 * @Description: ������ʵ��
	 * @author xuwenping
	 * @date 2017��11��20�� ����10:17:27 
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
			//����������ṹ�޸�
		}
		
	}
}
