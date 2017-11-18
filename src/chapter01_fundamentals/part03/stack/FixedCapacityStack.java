package chapter01_fundamentals.part03.stack;

/**
 * @ClassName: FixedCapacityStack 
 * @Description: see p84, һ�ֱ�ʾ���Ͷ���ջ�ĳ�����������
 * @author xuwenping
 * @date 2017��11��15�� ����9:20:04 
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
		//�������ݲ���
		if (N == a.length) {
			resize(a.length * 2);
		}
		a[N++] = item;
	}
	
	public Item pop() {
		Item item = a[--N];
		//�������ݲ���
		a[N] = null;//�����������
		if (N == a.length / 4 && N > 0) {
			resize(a.length / 2);
		}
		return a[--N];
	}
	
	/**
	 * @Title: resize 
	 * @Description: �ı�����������С��ȷ����������ʹ������25% ~ 100% ֮��
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
