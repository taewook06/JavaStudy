package JAVA_1006;

public class Overloading {
	public static void main(String[] args) {
		
		// 두 정수값 받아서 더하는 add 매서드
		// 두 정수값 받아서 곱하는 multi 매서드 
		
		// 더한 합값과 곱한값을 한 문장에 출력하는 매서드 (void)
		
		Overloading overloading = new Overloading();
		System.out.println(overloading.printOut(10, 5));
				
	}	
	int add(int a, int b)
	{
		return a + b;
	}	
	int multi(int a, int b)
	{
		return a * b;
	}
	String printOut(int a, int b)
	{
		int sum = add(a,b);
		int sum2 = multi(a,b);
		return "sum : " + sum + ", sum2 :" + sum2;
	}
}

