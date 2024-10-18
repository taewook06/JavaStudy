package JAVA_1006;

public class Test {
	
	 int add(int a, int b)
	{
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();		// 인스턴스 생성 해주어야함. 인스턴스 없이 쓰려면 static 붙여야함.
		System.out.println(test.add(10, 20));		
	}	
	
}
