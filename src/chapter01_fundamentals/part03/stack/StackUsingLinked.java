package chapter01_fundamentals.part03.stack;

import java.util.Iterator;

/**
 * @ClassName: StackUsingLinked 
 * @Description: ʹ������ʵ�ֵ���ѹջ�� ����ȳ����ӱ�ͷ�����ӱ�ͷ��
 * @author xuwenping
 * @date 2017��11��20�� ����9:24:06 
 * @version V1.0
 * @param <Item>
 */
public class StackUsingLinked<Item> extends Stack<Item>{

	private Node first;
	private int N;
	
	@Override
	public Iterator<Item> iterator() {
		return new MyInterator();
	}

	@Override
	public void push(Item item) {
		Node node = new Node(item);
		node.next = first;
		first = node;
		N++;
	}

	@Override
	public Item pop() {
		Node node = first;
		first = node.next;
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
	 * @Description: �ڲ��࣬��ʾ���ӽڵ�
	 * @author xuwenping
	 * @date 2017��11��20�� ����9:25:10 
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
	 * @ClassName: MyInterator 
	 * @Description: ������ʵ��
	 * @author xuwenping
	 * @date 2017��11��20�� ����10:15:36 
	 * @version V1.0
	 */
	private class MyInterator implements Iterator<Item> {
		
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
			// ���������������޸�
		}
		
	}
}
