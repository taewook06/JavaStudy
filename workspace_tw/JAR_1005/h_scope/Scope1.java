package h_scope;

public class Scope1 {
	public static void main(String[] args) {
		// 지역변수(local variable) : 본인의 지역(코드 블록)안에서만 사용할 수 있는 변수
		// 스코프(scope) : 변수의 접근 가능한 범위
		// 지역변수는 변수를 선언한 시점부터 코드 블록이 끝날때까지 사용 가능함
		
		int m = 10; // m 스코프 시작 (=코드블록 내 선언된 시점)
		if(true) {
			int x = 20; // x 스코프 시작 (=코드블록 내 선언된 시점)
			System.out.println("m = " + m);
			System.out.println("x = " + x);
		} // x 스코프 종료 (=코드블록 끝)
//		System.out.println("x = " + x); 
	} // m 스코프 종료 (=코드블록 끝)
	
}
