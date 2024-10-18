package f_condEx1;

public class C_IfEx3 {

	public static void main(String[] args) {
		// 문제3
		// 온라인 쇼핑몰의 할인 시스템을 개발해야 한다.
		// 한 사용자가 어떤 상품을 구매할 때, 여러 할인 조건에 따라 총 할인 받는 금액이 달라질 수 있다
		
		// 할인조건
		// 물건 가격이 10000원 이상일 때 : 1000원 할인
		// 사용자 나이가 10살 이하일 때 : 1000원 할인
		
		// 핵심기능 : 한명의 사용자가 동시에 여러 할인을 받을 수 있어야 함
		// 예를 들어, 10000원짜리 물건을 구매할 때 1000원 할인을 받고
		// 동시에 10살 이하를 만족하는 경우, 추가로 1000원 더 할인을 받는다
		
		int price = 10000;
		int age = 10;
		int discount = 0;
		
		// 총 구매금액으로 할인가 책정
		if(10000 <= price) {
			discount += 1000;
		}else {
			discount += 0;
		}
			
		// 사용자 나이로 할인가 책정
		if(age <= 10) {
			discount += 1000;
		}
		
		System.out.printf("사용자가 할인받은 금액은 : %d 원 \n", discount);
		System.out.printf("사용자가 지불할 금액은 : %d 원" , (price - discount));
		
	}
}
