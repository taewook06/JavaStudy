package ex01;

public class Break {
	public static void main(String[] args) {
		
		// break문 : break문이 포함된 가장 가까운 반복문을 벗어나는 코드
		
		int sum = 0;
		int i = 0;
		
		while  (true) 
		{
			if(sum > 100)
			{
				break;
			}
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum =" + sum);
		
	}
}
