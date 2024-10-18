package c_operator;

public class H_Logical1 {

	public static void main(String[] args) {
		// 논리연산자1
		
		// AND 연산자
		// 모두 참이어야 true 반환
		// 거짓이 한개만 있어도 false 반환
		System.out.println("&&: AND 연산");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false); // deadcode인 이유(비효율적)
		
		// deadcode 사례
		if(false) {
			System.out.println("hello");
		}
		
		System.out.println();
		
		// OR 연산자 
		// 참이 한개만 있어도 true 반환
		// 참이 한개도 없으면 false 반환
		System.out.println("||: OR 연산");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false ||false);

		System.out.println();
		
		System.out.println("!: 부정 연산");
		System.out.println(!true);
		System.out.println(!false);

		System.out.println();
		
		System.out.println("변수 활용");
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(!b);
		
	}
}
