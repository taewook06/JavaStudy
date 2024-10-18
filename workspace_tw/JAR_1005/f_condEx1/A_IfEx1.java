package f_condEx1;

public class A_IfEx1 {

	public static void main(String[] args) {
		// 문제1
		// 연령에 따라 다른 메세지 출력 프로그램을 작성 (if문 사용) 
		// int age 라는 변수를 사용하여 연령에 따라 다음의 출력을 하세요
		
		//  7세 이하인 경우 : "미취학" 
		//  8세 이상 13세 이하인 경우 : "초등학생" 
		// 14세 이상 16세 이하인 경우 : "중학생" 
		// 17세 이상 16세 이하인 경우 : "고등학생" 
		// 20세 이상인 경우 : "성인"
		
		int age = 15;
		
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
		
		// 위 코드의 단점 : 불필요한 중복 조건을 계속 수행해야 함
		// if문 사용목적 : 불필요한 조건을 없애고 코드 효율 향상하기 위함
	}
}
