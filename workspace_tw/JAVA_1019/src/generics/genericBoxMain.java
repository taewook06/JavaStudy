package generics;

public class genericBoxMain {
	public static void main(String[] args) {
		genericBox<Integer> boxi = new genericBox<>(123);
		boxi.printItem();
	}
}
