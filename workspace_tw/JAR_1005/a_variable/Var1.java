package a_variable;

public class Var1 {
	public static void main(String[] args) {
		// 변수 사용 목적 
		// 값 저장 & 코드중복 제거 
		System.out.println("10");
		System.out.println("10");
		System.out.println("10");
	
		System.out.println("--------------");
		// 지역변수는 반드시 초기값을 넣어주어야 함
		// int aa;
		// System.out.println(aa);
		int a = 10;
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		// 변수의 값을 변경하면, 기존에 있던 값은 삭제됨
		a = 15;
		System.out.println(a);
		
		// final 키워드 (=재할당 불가한 변수 =상수)  
		final String USER_ID = "user1";
		// USER_ID = "user2";
		
		// 변수 명명규칙
		// class : 앞자 대문자 (나머지 모두 소문자)
		// 카멜표기 : myAccount 
		// 상수는 전부 대문자 ex) USER_LIMIT
		// 스네이크 표기 : my_account (상수 제외, 잘 안씀)
		
//--------------------------------------------------------------------------		
		
		// 자주쓰는 단축키
		/* 
		 1) 세로열 일괄 선택
		    Alt + Shift + A  
		    Shift + 방향키(위,아래)
		 
		 2) 문장 주석
		    Ctrl + /   
		 
		 3) 문장 위아래 이동시키기
		    Alt + 방향키(위,아래)
		       
		 4) 문장 복사  
		    복사하려는 문장 블럭 + (Ctrl + Alt)누른상태로 방향키(위,아래)
		        
		 5) 들여쓰기 : tab / 내어쓰기 : Shift 누른상태로 tab (순서대로)
		*/
	}
}
