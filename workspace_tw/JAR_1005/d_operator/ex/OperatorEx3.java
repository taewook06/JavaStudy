package d_operator.ex;

public class OperatorEx3 {
	public static void main(String[] args) {
		// 문제3
		// int형 변수 score를 선언
		// score가 80점 이상이고, 100점 이하이면 true를 출력하고 아니면 false출력
		
		int score = 80;
		boolean result = (80 <= score && score <= 100);
		
		System.out.println("result : " + result);

		System.out.println("------------------");
		
		if(result) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
