package c_operator;

public class G_Compare2 {
	public static void main(String[] args) {
		// 문자열 비교 equals()
		String str1 = "문자열1";
		String str2 = "문자열2";
		
		boolean result1 = "hello".equals("hello"); // 리터럴 vs 리터럴 비교
		boolean result2 = str1.equals("문자열1"); // 문자열 변수 vs 리터럴 비교
		boolean result3 = str1.equals(str2); // 문자열 변수 vs 문자열 변수 비교
				
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}