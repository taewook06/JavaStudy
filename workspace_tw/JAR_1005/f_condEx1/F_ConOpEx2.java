package f_condEx1;

public class F_ConOpEx2 {

	public static void main(String[] args) {
		// 문제2
		// 홀수 짝수 찾기 (삼항연산자 사용)
		// 정수 x가 짝수이면 "짝수"를 홀수이면 "홀수"를 출력하는 프로그램 작성
		
		// 짝수 찾는 방법 :: 나머지 연산자
		
		int x = 0;
		String result = (x % 2 == 1) ? "홀수" : (x % 2 == 0) ? "짝수" : "0" ; 
		System.out.println("x는 " + result);
		
		System.out.println("---------------------");
		
		x = 0;
		result = (x % 2 == 1) ? "홀수" : (x % 2 != 0) ? "짝수" : "0";  
		System.out.println("x는 " + result);
	
	}
}
