package JAVA_1006;

public class Method {

	// 접근제어자 변환타입 메서드명(매개변수타입 매개변수명)
	
	int a = 1;
	int b = 2;
	
	// 매서드 오버로딩 (코드 재사용)
	public int add(int a, int b)
	{
		int sum = 0;
		
		sum = a + b;
		
		return sum;
	}
	public String add(int a, String b)
	{
//		String result = a + b;
		int sum = 0;
		
		return sum;
	}
}
