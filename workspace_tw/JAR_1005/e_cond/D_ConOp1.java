package e_cond;

public class D_ConOp1 {

	public static void main(String[] args) {
		// 삼항연산자 (조건식)? 참표현식 : 거짓표현식;
		// if문 → 삼항연산자로 변경
		int age = 18;
		String status;
		
		if(18 <= age) {
			status = "성인";
		}else {
			status = "미성년자";
		}
		System.out.println("age = " + age + ", status = " + status);
		
		// 삼항연산자
		status = (18 <= age) ? "성인" : "미성년자";
		System.out.println("age = " + age + ", status = " + status);
		
		// 표현식이기 때문에 결과값이 반환되므로
		// 좌항에는 반환값이 담길 변수가 있어야 함 or 바로 값으로 사용
		// 문장이 아니고 반환 결과가 리터럴 값이기 때문에 덩그러니 문장처럼 작성하면 안됨
		
		// 삼항연산자 사용 목적
		// 단순 참과 거짓에 따라 특정값을 구하는 경우 
		// if문보다 간결하게 코드 작성할 수 있음 
	}
}
