package c_operator;

public class J_Assign1 {

	public static void main(String[] args) {
		// 복합대입연산자 (=축약연산자)
		int a = 5;
		a += 3; // a = a + 3
		a -= 3; // a = a - 3
		a *= 3; // a = a * 3
		a /= 3; // a = a / 3
		a %= 3; // a = a % 3
		
		System.out.println(a);
		
		// 여기까지 배운 연산자만으로도 충분히 개발 가능
	}
}
