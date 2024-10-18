package ex01;

import java.util.Scanner;

public class if2 {
	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요 >> "); 
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int score = Integer.parseInt(str);
		
		char grade = ' ';
		
		if(score >= 90)
		{
			grade = 'A';
		}
		else if(score >= 80)
		{
			grade = 'B';
		}
		else if(score >= 70)
		{
			grade = 'C';
		}
		else
		{
			grade = 'D';
		}
		
		System.out.printf("당신의 학점은 %c 입니다.", grade);
	}
}
