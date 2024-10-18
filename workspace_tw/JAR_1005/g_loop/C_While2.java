package g_loop;

public class C_While2 {
	public static void main(String[] args) {
		// while 반복문2 (무한루프)
		int sum = 0;
		int i = 1;
		int endNum = 3; // 반복하려는 회수
		
		while(i <= endNum) {
			sum += i;
			i++;
			// sum = 0 + 1 (true)
			// sum = 1 + 2 (true)
			// sum = 3 + 3 (true)
			// sum :: 6
			
			// sum = 6 + 4 (false)
		}
		System.out.println("sum : " + sum);
 	}
}
