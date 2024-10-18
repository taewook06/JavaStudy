package e_cond;

public class A_If1 {

	public static void main(String[] args) {
		// if문 
		int age = 20; // 사용자 나이
		
		if(18 <= age) {
			System.out.println("성인입니다");
		}
		
		if(age < 18) {  // 거짓이면 실행 안하고 다음 블럭으로 감
			System.out.println("미성년자입니다");
		}
		
		// If문은 특정조건이 참인지 확인하고 
		// 조건이 참인 경우에만 코드 블록을 실행함
		// * 코드블럭 : { } 중괄호 사이에 있는 코드
		
		System.out.println("-----------");
		// else문 
		// if문을 보다 간략하게 작성하기 위함
		if(18 <= age) {
			System.out.println("성인입니다");
		}else { // 만족하는 조건 없을 때 실행
			System.out.println("미성년입니다");
		} 
		
		// if문에서 코드 블럭 생략 가능하지만 가능하면 가독성 있게 코드블럭으로 감싸줄것
		
	}

}
