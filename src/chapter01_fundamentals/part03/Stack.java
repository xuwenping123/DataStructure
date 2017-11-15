package chapter01_fundamentals.part03;

public abstract class Stack<Item> implements Iterable<Item> {

	public Stack() {}
	
	public abstract  void push(Item item);
	
	public abstract Item pop();
	
	public abstract boolean isEmpty();
	
	public abstract int size();
}
