
package a_variable;

public class Var3 {
	public static void main(String[] args) {
		// 데이터 타입 (=자료형)
		
		// 정수
//		byte bb = 127; (x) 파일전송 할때 사용할 수 있음
//		short ss = 32767; (x) 표현길이 너무 작아서 거의 사용안함
		int a = 100; // 거의 모든 숫자 데이터에 사용(표현범위 20억 넘어가는 경우만 long 사용)
		long l = 9_223_372_036_854_807L;  

		// 실수
//		float f = 10.0F; // (X) 표현길이와 정밀도가 낮아서 권장안함
		double b = 10.5; // 대부분의 소숫점 데이터 다룰때 사용(정밀도 높음)
		
		// 논리형 (true, false)
		boolean c = true; // 불리언(boolean) true, false (조건문에서 자주쓰임) 
		
//		char d = 'A'; // 문자 하나. 작은따옴표(')사용 . 
		String e = "Hello world"; // 문자열. 큰따옴표(") 사용 
								  // 문자 하나만 표현할때도 String 사용하기	 
	}
}
