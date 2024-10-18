package e_cond;

public class B_Switch1 {

	public static void main(String[] args) {
		// switch문1 (break문과 세트)
		
		// grade 1 이면 coupon 1000
		// grade 2 이면 coupon 2000
		// grade 3 이면 coupon 3000
		// 그 밖의 경우 coupon 500
		
		int grade = 2;
		int coupon = 0;
		
		switch (grade) {
			case 1:
				coupon = 1000;
				break; // 없는 경우 조건을 이미 만족했음에도 아래 코드 수행함
			case 2:
				coupon = 2000;
				break;
			case 3:
				coupon = 3000;
				break;
			default:
				coupon = 500;
		}
		System.out.println("발급받은 쿠폰 : " + coupon);
		// switch문의 조건식에 들어갈 수 있는 것
		// 단순 값(=기본자료형 데이터, boolean 제외) 또는 조건식(=연산 결과값이 기본자료형 or 문자열인 식)
		
		// switch문 사용목적 : 조건식(값)과 case문의 두 값이 같은지 비교연산
		
		// if, else if, switch문 중 본인이 선호하는 스타일로 작성
				
	}
}
