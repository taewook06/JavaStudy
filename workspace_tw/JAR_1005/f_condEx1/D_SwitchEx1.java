package f_condEx1;

public class D_SwitchEx1 {

	public static void main(String[] args) {
		// 문제1
		// 점수에 따라 아래와 같이 등급을 출력 (switch문 사용_신규/구 무관)
		// 90점 : A 
		// 80점 : B 
		// 70점 : C 
		// 60점 : D
		
		int score = 80;
		String grade = "";
		
		grade = switch (score) {
			case 90 -> "A";
			case 80 -> "B";
			case 70 -> "C";
			case 60 -> "D";
			default -> "-";
		};
		System.out.println("grade : " + grade);
	}

}
