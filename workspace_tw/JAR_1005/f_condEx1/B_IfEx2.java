package f_condEx1;

public class B_IfEx2 {

	public static void main(String[] args) {
		// 문제2
		// if문 → else if문으로 변경 (if문 전체를 하나로 묶어줌)
		int age = 6;
		
		if(age <= 7) {
			System.out.println("미취학");
		}
		
		if(8 <= age && age <= 13) {
			System.out.println("초등학생");
		}
		
		if(14 <= age && age <= 16) {
			System.out.println("중학생");
		}
		
		if(17 <= age && age <= 19) {
			System.out.println("고등학생");
		}
				
		if(20 < age) {
			System.out.println("성인입니다");
		}
		
		// else if문으로 변경
		if(age <= 7) {
			System.out.println("미취학");
			
		}else if(8 <= age && age <= 13) {
			System.out.println("초등학생");
			
		}else if(14 <= age && age <= 16) {
			System.out.println("중학생");
			
		}else if(17 <= age && age <= 19) {
			System.out.println("고등학생");
			
		}else {
			System.out.println("성인입니다");
		}
		
		// else if 로 작성하는 경우의 주의사항
		// 조건을 만족하는 즉시, 이후의 코드를 수행하지 않기 때문에 
		// 필수로 수행해야 하는 조건은 별도의 if문으로 작성해줘야 함
		
	}
}
