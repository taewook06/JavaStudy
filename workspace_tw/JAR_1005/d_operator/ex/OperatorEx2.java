package d_operator.ex;

public class OperatorEx2 {
	public static void main(String[] args) {
		// 문제2
		// 다음의 double 변수들을 선선하고 그 합과 평균을 출력
		// 이때 합의 결과는 소수점 이하를 버림하고, 평균 결과는 소수점 있는 상태로 출력
		double val1 = 1.5;
		double val2 = 2.5;
		double val3 = 3.5;
		
		int sum = 0;
		double average = 0;
		
		// 더 큰 데이터 타입으로 자동형변환
//		sum = val1 + val2 + val3; // double 상태
		((Double)(val1 + val2 + val3)).getClass().getName();
		
		// getClass 메서드는 참조타입에서만 사용가능
		String str = "1234";
		System.out.println(str.getClass().getName());
		int nn = Integer.parseInt(str);
				
		average = sum / 3;
		
		System.out.println("sum : " + sum);
		System.out.println("average : " + average);
		
	}
}
