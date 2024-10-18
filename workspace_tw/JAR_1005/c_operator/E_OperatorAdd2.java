package c_operator;

public class E_OperatorAdd2 {
	public static void main(String[] args) {
		// 전위 증감연산자 (증감연산 수행 후 다른 연산 수행)
		int a = 1;
		int b = 0;
		
		b = ++a; // a의 값 먼저 증가시키고, 그 결과를 b에 대입
		System.out.println("a = " + a + ", b = " + b);
		
		// 후위 증감연산자 (다른연산 먼저 수행 후 증감연산 수행)
		a = 1;
		b = 0;
		
		b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
		System.out.println("a = " + a + ", b = " + b);
		
	}
}
