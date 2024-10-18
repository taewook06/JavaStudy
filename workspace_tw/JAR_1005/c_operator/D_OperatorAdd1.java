package c_operator;

public class D_OperatorAdd1 {
	public static void main(String[] args) {
		// 증감연산자 
		int a = 0;
		
		a = a + 1; // 자기자신에게 1을 더하고 → 다시 대입해줌 (a = 0 + 1)
		System.out.println("a = " + a); 

		a = a + 1; // 2 (a = 1 + 1) 
		System.out.println("a = " + a + "\n"); 
		
		++a; // a = a + (해당 변수에 들어있는 숫자값을 1증가)
		System.out.println("a = " + a); // 3
		++a; // a = a + 1 
		System.out.println("a = " + a); // 4
		
	}
}
