package ex01;

public class EnhancedFor {
	public static void main(String[] args) {
		
		/*
		 * 향상 for문
		 * 
		 * for(타입 변수명; 배열 또는 컬렉션)
		 * {
		 * 		//반복할 문장
		 * }		 * 
		 * 
		 */
		
		// 기본 for문
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i <= arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		// 향상 for문
		for(int tmp : arr)
		{
			System.out.println(tmp);
		}
	}
}
