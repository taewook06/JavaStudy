package g_loop;

public class D_DoWhile1 {
	public static void main(String[] args) {
		// do while 반복문 (1번은 무조건 실행 + 반복)
		int sum = 0;
		int i = 1;
		int endNum = 3; // 반복하려는 회수
		 
		do {
			sum += i;
			i++;			
		}while(i <= endNum); 
			// sum = 0 + 1 (true)
			// sum = 1 + 2 (true)
			// sum = 3 + 3 (true)
			// sum :: 6
			
			// sum = 6 + 4 (false)	
		System.out.println("sum : " + sum);
		// 조건에 따라 한번도 실행되지 않을 수 있는 경우
		// 한번은 무조건 실행될 수 있도록 할때 사용
		// while문 만으로도 구현할 수 있어서 편의에 의해 사용하면 됨
 	}
}
