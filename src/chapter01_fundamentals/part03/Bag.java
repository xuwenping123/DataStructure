package chapter01_fundamentals.part03;

/**
 * @ClassName: Bag 
 * @Description: 背包的基本API 
 * @author xuwenping
 * @date 2017年11月15日 下午9:31:48 
 * @version V1.0
 * @param <Item>
 */
public abstract class Bag<Item> implements Iterable<Item> {

	public Bag() {}
	
	public abstract void add(Item item);

	public abstract boolean isEmpty();

	public abstract int size();

}
