package i_casting;

public class B_Casting2 {

	public static void main(String[] args) {
		// 명시적 형변환(=캐스팅) 
		int div1 = 3 / 2;
		System.out.println("div1 = " + div1);
		
		double div2 = 3 / 2;
		System.out.println("div2 = " + div2);
		
		double div3 = 3.0 / 2;
		System.out.println("div3 = " + div3);
		
		double div4 = (double)3 / 2;
		System.out.println("div4 = " + div4);
		
		// 변수를 사용하는 경우에도 동일하게 형변환 함
		int a = 3;
		int b = 2;
		double result = (double) a / b;
		System.out.println("result = " + result);
		
		// 결론
		// 같은 타입끼리의 계산은 같은 타입의 결과를 낸다
		// 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다
		
	}
}
