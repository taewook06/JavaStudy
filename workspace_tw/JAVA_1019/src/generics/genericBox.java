package generics;

public class genericBox <T>{
	private T item;

	public genericBox(T item) {
		super();
		this.item = item;
	}
	
	public void printItem() {
		System.out.println("Item:" + item);
	}
}
