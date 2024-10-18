package g_loop;

public class E_Break1 {

	public static void main(String[] args) {
		// break문 & continue문 (반복문에서 사용할 수 있는 키워드)
		// while, do while, for 와 같은 모든 반복문에서 사용 가능
		
		// break문 : 반복문 즉시 종료 후 반복문 빠져나감
		// 숫자 1부터 계속 누적해서 더하다가
		// 처음으로 합이 10보다 커지는 값은 얼마인가 (1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10 보다 큰 경우) 
		
		int sum = 0;
		int i = 1;
		
		while (true) { // 무한반복
			sum = sum + i; // sum = 1
			
			if (10 < sum) { // 조건을 만족하면 코드블럭 수행
				System.out.println("합(sum)이 10보다 크면 종료: i=" + i + ", sum=" + sum);
				break; // while문 전체를 빠져나감
			}
			i++;	
		}
	}
}
