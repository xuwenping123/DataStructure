package chapter01_fundamentals.part03;

/**
 * @ClassName: Stack 
 * @Description: 栈的基本API
 * @author xuwenping
 * @date 2017年11月15日 下午10:51:01 
 * @version V1.0
 * @param <Item>
 */
public abstract class Stack<Item> implements Iterable<Item> {

	public Stack() {}
	
	public abstract  void push(Item item);
	
	public abstract Item pop();
	
	public abstract boolean isEmpty();
	
	public abstract int size();
}
