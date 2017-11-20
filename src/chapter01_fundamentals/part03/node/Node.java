package chapter01_fundamentals.part03.node;

/**
 * @ClassName: Node 
 * @Description: see P90, ����Ľ����
 * 
 * ����Ļ��������У�
 * 
 * 1. �ڱ�ͷ������
 * 2. �ڱ�ͷɾ�����
 * 3. �ڱ�β������
 * 4. ɾ��ָ���Ľ��
 * 5. ��ָ���Ľ��ǰ����һ���½��
 * 6. ������Ԫ�صı���
 * 
 * @author xuwenping
 * @date 2017��11��18�� ����9:43:16 
 * @version V1.0
 * @param <Item>
 */
public class Node <Item>{

	Item item;//�洢����
	Node next;// �洢��һ���ڵ�
	
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
