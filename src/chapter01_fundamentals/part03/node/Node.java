package chapter01_fundamentals.part03.node;

/**
 * @ClassName: Node 
 * @Description: see P90, 链表的结点类
 * 
 * 链表的基本操作有：
 * 
 * 1. 在表头插入结点
 * 2. 在表头删除结点
 * 3. 在表尾插入结点
 * 4. 删除指定的结点
 * 5. 在指定的结点前插入一个新结点
 * 6. 数组中元素的遍历
 * 
 * @author xuwenping
 * @date 2017年11月18日 下午9:43:16 
 * @version V1.0
 * @param <Item>
 */
public class Node <Item>{

	Item item;//存储数据
	Node next;// 存储下一个节点
	
	public Node(Item item, Node next) {
		this.item = item;
		this.next = next;
	}
	
	public Node() {}
	
	public static void main(String[] args) {
		Node<Object> node = new Node<Object>();
		node.item = 0;
		node.next = new Node<Object>(0, null);
	}
}
