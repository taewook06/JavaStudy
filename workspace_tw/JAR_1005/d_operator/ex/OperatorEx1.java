package d_operator.ex;

public class OperatorEx1 {
	public static void main(String[] args) {
		// 문제1
		// num1, num2, num3 세개의 int 타입 변수를 선언하고 각각 10,20,30으로 초기화
		// 세 변수의 합을 계산하고, 그 결과를 sum 이라는 이름의 int 타입 변수에 저장
		// 세 변수의 평균을 계산하고, 그 결과를 average 라는 이름의 변수에 저장
		// 이때 소수점 이하의 결과는 버림하세요
		// 최종 sum과 average 변수의 값을 출력하세요
		
		int num1 = 10;
		int num2 = 22;
		int num3 = 35;
		
		int sum = 0;
		double average = 0;
		
		sum = (num1 + num2 + num3);
		average = sum / 3;
		System.out.println("sum : " + sum);
		
		// 소수점 이하 출력시
		average = (double)(sum / 3);
		System.out.println("average : " + average);
		
		// 기본 데이터 타입에서는 getClass 메서드를 지원하지 않음
		// 확인하려면 기본데이터 타입을 wrrapper class로 변환해서 확인가능
		int average2 = (int)average;
		System.out.println(((Integer)average2).getClass().getName());
		
		// Integer.parseInt(String str):입력이 문자열인 경우에만 사용(문자열→숫자변환)
		// (int)형변환: 기본 타입간의 변환 시 주로 사용
		// 주로 실수형 타입에서 정수형으로 변환 시 사용
		
		double db = 1235.12;
		int aa = (int)db;
		System.out.println(aa);
		
		
	}
}
