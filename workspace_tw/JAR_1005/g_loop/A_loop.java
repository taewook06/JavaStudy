package g_loop;

public class A_loop {
	public static void main(String[] args) {
		// 반복문 들어가기전 
		// 반복문이 필요한 이유 = 변수를 사용하는 이유 
		// 수정사항이 생겼을때 변경해야 할 코드 양이 적은 것이 좋은 코드임
		// 얼마나 유연하고 확장성 있게 수정할 수 있느냐를 지표로 평가할 수 있음
		
		int sum = 0;
		// 변경되는 리터럴이 들어가는 부분을 변수 사용하도록 수정
//		int i = 1;
		
		// 1부터 1씩 증가하면서 더해주기
		// 10부터 1씩 증가하면서 더해주기 (변수를 쓰지 않으면 각각 바꿔줘야 함)
		sum = sum + 1;
		System.out.println("sum : " + sum);
//		i++;
		
		sum = sum + 2;
		System.out.println("sum : " + sum);
//		i++;
		
		sum = sum + 3;
		System.out.println("sum : " + sum);
//		i++;
		
		sum = sum + 4;
		System.out.println("sum : " + sum);
//		i++;
		
 	}
}
