package g_loop;

public class G_For1 {

	public static void main(String[] args) {
		// for문 (초기식; 조건식; 증감식)
		// 1 ~ 10까지 출력
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}	
		
		// while문이랑 똑같은데 초기값 세팅 + 증감식 이 추가된 개념 (특정 반복횟수가 정해져 있는 경우 사용함)
		// 반복횟수에 직접적인 영향을 주는 변수를 선언부터, 조건식에 활용, 값 증가가지 for(초기식; 조건식; 증감식) 구조로 처리함
		// while문의 경우 변수 i를 선언하는 부분과 i++로 증가하는 부분의 코드가 분산되어 있음
		int sum = 0;
		int endNum = 3;
		
		// sum= 1+2+3
		for(int i = 1; i <= endNum; i++) { // for문 초기식의 i를 카운터 변수 라고도 부름 
			sum = sum + i; 		           // 카운터 변수 i 를 증가시키면서 반복 횟수가 올라가고, 또 변수 i를 사용하여 계속 반복할지 빠져나갈지 판단할 수 있음
			System.out.println("i=" + i + ", sum=" + sum);
		}
		
		// for문 조건식 다중선언 (가능은하지만 보기 어려움)
		for(int num = 2, count = 1; count <= 10; num += 2, count++) {
			System.out.println(num);
		}
		
	}
}
