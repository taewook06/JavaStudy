package ex01;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		int input;
		
		System.out.println("숫자를 입력하세요. ");
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();		
		
		//input = (int)str; 문자열을 정수형으로 강제 변환 불가능
		input = Integer.parseInt(str); // 문자열이 정수라면 정수형으로 변환 (아니라면 예외처리)
		
		if (input == 0)
		{
			System.out.println("입력하신 숫자는 0 입니다.");
		}		
		else if(input != 0)
		{
			System.out.println("입력하신 숫자는 0 이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다.",input);	
		}
	}
}
