package g_loop;

public class B_While1 {
	public static void main(String[] args) {
		// while 반복문1 (조건이 false일 때 까지 무한루프)
		// 조건식이 참이면 코드블럭{ }을 반복해서 실행 (거짓일때까지 반복)
		
		// count 변수에 1 더하는 코드를 5번 반복
		int count = 0;
		count = count + 1; // count = 0 + 1
		count = count + 1; // count = 1 + 1
		count = count + 1; // count = 2 + 1
		count = count + 1; // count = 3 + 1
		count = count + 1; // count = 4 + 1
		/*
		count += 1;
		count += 1;
		count += 1;
		count += 1;
		count += 1;
		*/
		System.out.println("count : " + count);
		System.out.println("-----------");
		
		// 반복문 사용
		count = 0;
		// count = 5 되는 순간 false → while문을 빠져나감
		// 그 전까지 { } 코드 무한반복 실행
		while (count < 5) {
			count += 1; // count = count + 1;
		}	
		System.out.println("count : " + count);
 	}
}
