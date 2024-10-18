package c_operator;

public class F_Compare1 {
	public static void main(String[] args) {
		// 비교연산자
		int a = 3;
		int b = 2;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		// 결과를 boolean 변수에 담기
		boolean result = (a == b);
		System.out.println("\n" + result);
	}
}
