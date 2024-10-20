package test;

public interface Car{}

class Sonata implements Car{}

class K5 implements Car{}

public class C {
	public static void main(String[] args) {
		Car car = new K5();
		Car car1 = new Sonata();
	}
}
