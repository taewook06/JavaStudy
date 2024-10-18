package c_operator;

public class C_Operator3 {
	public static void main(String[] args) {
		// 연산자 우선순위
		// 상식선에서 생각할 것 (우선순위표 암기 NO)
		// 애매할땐 괄호 사용하기
		int sum1 = 2 * 2 + 3 * 3 / 3 + 2; 
		System.out.println(sum1);
		int sum2 = ((2 * 2) + (3 * 3)) / (3 + 2); 
		System.out.println(sum2);
		
		// 누가봐도 쉽고 명확히 이해할 수 있는 코드가 좋은 코드
		// 애매하거나 복잡한 코드는 절대 좋은 코드가 아님
		// 개발에서 가장 중요한 것은 '단순함'과 '명확함'
	}
}
