package f_condEx1;

public class E_ConOpEx1 {

	public static void main(String[] args) {
		// 문제1
		// 더 큰 숫자 찾기 (삼항연산자 사용)
		// 정수 a 의 값은 10 이고, 정수 b의 값은 20 이다
		// 삼항연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드 작성
		
		int a = 10;
		int b = 20;
		
		int max = (a < b) ? b : a;
		
		System.out.println("둘 중 더 큰 숫자는 : " + max);
		
	}
}

