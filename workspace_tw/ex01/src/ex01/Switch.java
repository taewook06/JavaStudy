package ex01;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
//		Switch문
		
//		switch문의 조건식 결과는 정수 또는 문자열 이여야 한다.
//		case문의 값은 정수 혹은 상수만 가능하며, 중복 불허한다.
		
		System.out.println("현재 월을 입력하세요 >> ");
		
		Scanner scanner = new Scanner(System.in);
		int month = Integer.parseInt(scanner.nextLine()); 
		
		switch (month)
		{
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		}
	}
}
