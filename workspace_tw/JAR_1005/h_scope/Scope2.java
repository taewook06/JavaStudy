package h_scope;

public class Scope2 {
	public static void main(String[] args) {
		// for문으로 보는 지역변수
		int m = 10;
		for(int i = 0; i < 2; i++) { // for문 안에서 선언된 변수는, for문 코드블록 안에서만 사용할 수 있는 지역변수임
			System.out.println("for m = " + m); // main메서드 에서 선언되었기 때문에 main메서드 끝날때 생존 종료됨
			System.out.println("for i = " + i);
		} // i 생존 종료 (for문 끝)
		
		// scope 존재이유 예시
		// if문 안에서 단순연산을 위해 필요한 임시저장변수(tmp)가 필요하다면
		// 굳이 main 메서드 시작지점에서 선언해줄 필요없기 때문
		
		// 변수는 필요한 범위에 맞게 한정해서 사용하는 것이 좋음
	}
}
