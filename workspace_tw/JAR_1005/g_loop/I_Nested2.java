package g_loop;

public class I_Nested2 {

	public static void main(String[] args) {
		// 중첩 for문
		// 별찍기
		int rows = 3;
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		// 하나씩 출력 해보고 규칙 찾아서 코드로 변환할 것 
		
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
	}
}
