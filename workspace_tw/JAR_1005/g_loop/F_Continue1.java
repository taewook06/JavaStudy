package g_loop;

public class F_Continue1 {

	public static void main(String[] args) {
		// continue문 : 반복문 안에서 continue를 만나면, 이후 코드 실행하지 않고 다시 반복문의 조건식으로 이동함
		
		int i = 1;
		
		// i=1,2,4,5 
		while(i <= 5) {
			if(i == 3) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
