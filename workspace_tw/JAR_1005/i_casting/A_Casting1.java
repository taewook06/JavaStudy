package i_casting;

public class A_Casting1 {

	public static void main(String[] args) {
		// 명시적 형변환(=캐스팅) 
		double doubleValue = 1.5;
		int intValue = 0;
		
//		intValue = doubleValue;
		
// 소수점 이하 값이 사라짐
// 은행 프로그램이 고객에게 은행 이자 계산하여 입금해야 하는데 
// 이런 코드가 아무런 오류 없이 수행되면 엄청난 문제 발생하므로 컴파일 오류를 발생시킴
		intValue = (int)doubleValue;
		
		// 형변환과 parseInt 는 다름
		// parseInt는 숫자로 된 문자열 타입을 정수 타입으로 변환해주는 것
		
	}
}
