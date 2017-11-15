package chapter01_fundamentals.part03;

/**
 * @ClassName: Queue 
 * @Description: ���еĻ���API
 * @author xuwenping
 * @date 2017��11��15�� ����9:32:23 
 * @version V1.0
 */
public abstract class Queue<Item> implements Iterable<Item> {

	public Queue() {}
	
	public abstract void enqueue(Item item);
	
	public abstract Item dequeue();
	
	public abstract boolean isEmpty();
	
	public abstract int size();
}
