package c_operator;

public class I_Logical2 {

	public static void main(String[] args) {
		// 논리연산자2
		
		int a = 15;
		// 다음의 문장에 대한 결과를 참,거짓 형태로 출력
		// a는 10보다 크고 20보다 작다
		boolean result = (10 < a) && (a < 20);
		System.out.println(result);
		// a는 30보다 크고 45보다 작다
		boolean result2 = (30 < a) && (a < 45);
		System.out.println(result2);
	
	}
}
