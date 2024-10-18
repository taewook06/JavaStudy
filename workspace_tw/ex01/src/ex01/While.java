package ex01;

public class While {
	public static void main(String[] args) {
		
		// 카운트다운 예제
		
		int i = 11;
		
		System.out.println("카운트다운 시작");
		
		while (i-- != 0)
		{
			System.out.println(i);
			
			for(int j = 0; j < 2_000_000_000; j++)
			{				
				for(int h = 0; h < 2; h++)
				{
					
				}
			}
		}
		System.out.println("GAME OVER");
	}
}
