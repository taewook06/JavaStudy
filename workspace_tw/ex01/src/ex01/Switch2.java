package ex01;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		
		// 사용자에게 주민번호 입력받기
		// 입력받은 번호의 8번째 문자를 통해 
		// 사용자의 성별을 구분하고 최종 사용자의 성별을 출력한다.
		
		// 1이면 2000년대 이전에 출생한 남자입니다.
		// 2이면 2000년대 이전에 출생한 여자입니다.
		// 3이면 2000년대 이후에 출생한 남자입니다.
		// 4이면 2000년대 이후에 출생한 남자입니다.
		
		System.out.println("주민번호를 입력하세요 >> ");
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		char gender = str.charAt(7);
		
		switch (gender)
		{
		case '1':
			System.out.println("2000년대 이전에 출생한 남자입니다.");
			break;
		case '2':
			System.out.println("2000년대 이전에 출생한 여자입니다.");
			break;
		case '3':
			System.out.println("2000년대 이후에 출생한 남자입니다.");
			break;
		case '4':
			System.out.println("2000년대 이후에 출생한 여자입니다.");
			break;
		}
		
	}
}
