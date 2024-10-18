package ex01;

public class Temp {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a = %d, b = %d", a, b);
	}
}
