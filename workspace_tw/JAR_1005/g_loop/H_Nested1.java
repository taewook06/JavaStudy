package g_loop;

public class H_Nested1 {

	public static void main(String[] args) {
		// 중첩 for문 : 반복문 내부에 반복문 중첩으로 작성(하지만 2번 이상의 중첩은 좋지 않음_while문도 중첩 가능함) 
		// 구구클래스 출력하기..!
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);				
			}
		}
	}
}
