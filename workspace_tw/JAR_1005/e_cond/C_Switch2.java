package e_cond;

public class C_Switch2 {

	public static void main(String[] args) {
		// switch문2 (Java 14 신규문법)
		// 값 반환에 중점을 둔 표현식 문법
		
		int grade = 1;
		int coupon = 0;
		
		coupon = switch (grade) {
			case 1 -> 1000; 
			case 2 -> 2000; 
			case 3 -> 3000; 
			case 4 -> 4000; 
			default -> 500;	
		};
		System.out.println("발급받은 쿠폰: " + coupon);
		
		// 코드블록 사용하면 추가 코드도 작성 가능함 
		grade = 3;

		coupon = switch (grade) {
		    case 1 -> {
		        System.out.println("grade 1");
		        yield 1000; // 블록 구문 사용시 'yield' 키워드로 값을 반환
//		        1000; // yield 키워드 없이 반환하면 에러
		    }
		    case 2 -> {
		        System.out.println("grade 2");
		        yield 2000;
		    }
		    case 3 -> {
		        System.out.println("grade 3");
		        yield 3000;
		    }
		    case 4 -> {
		        System.out.println("grade 4");
		        yield 4000;
		    }
		    default -> {
		        System.out.println("default");
		        yield 500;
		    }
		};

		System.out.println("발급받은 쿠폰: " + coupon);
		
		// 기존 switch문 사용목적 : 명령어 실행, 흐름제어 등의 복잡한 로직 처리시 사용
		// 신규 switch 표현식 사용목적 : 값 반환이 주요 목적이거나 간결한 코드 작성시 사용
		
		// 명령문과 표현식의 차이
		// 명령문 : 프로그램 제어나 특정 동작을 실행하기 위한 코드 (값 반환 없이 단순 흐름제어)
		// 표현식 : 값을 반환하는 코드 (모든 표현식은 값을 반환함)
	}
}
