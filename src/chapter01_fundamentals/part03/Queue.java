package chapter01_fundamentals.part03;

/**
 * @ClassName: Queue 
 * @Description: 队列的基本API
 * @author xuwenping
 * @date 2017年11月15日 下午9:32:23 
 * @version V1.0
 */
public abstract class Queue<Item> implements Iterable<Item> {

	public Queue() {}
	
	public abstract void enqueue(Item item);
	
	public abstract Item dequeue();
	
	public abstract boolean isEmpty();
	
	public abstract int size();
}
