package JAVA_1006;

import java.util.Scanner;

public class Bank {
	// 은행 계좌 입출금 시스템

	// 다음의 실행 예시를 참고하셔서, 사용자로부터 계속 입력을 받아서
	// 입금과 출금을 반복 수행하는 프로그램을 작성하세요
	// 또한 간단한 메뉴를 표시해서 어떤 동작을 수행해야 할지 선택할 수 있게 해주세요.
	// 출금시 잔액이 부족하다면 "X"원을 출금하려 했으나 잔액이 부족합니다 라는 문구를 출력해주세요.

	//-------------------------------------
	// 1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료
	//-------------------------------------
	// 선택: 1
	// 입금액을 입력하세요 : 10000
	// 10000원을 입금하였습니다. 현재 잔액 : 10000원
	// 선택: 2
	// 출금액을 입력하세요 : 8000
	// 8000원을 출금하셨습니다. 현재 잔액 : 2000원
	// 선택: 3
	// 현재 잔액: 2000원
	// 선택: 4
	// 시스템을 종료합니다.
	
	public static void main(String[] args) {
		
		String num;
		int balance = 0;
		
		do {
			System.out.println("-------------------------------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료 ");
			System.out.println("-------------------------------------");
			
			Scanner scanner = new Scanner(System.in);
		    num = scanner.nextLine();
		    
		    switch(num) {
		    case "1":
		    	System.out.printf("입금액을 입력하세요 : ");	
		    	Scanner scan1 = new Scanner(System.in);
		    	int deposit = Integer.parseInt(scan1.nextLine());
		    	balance += deposit;
		    	System.out.printf("%d원을 입금하였습니다.\n",deposit);	
		    	break;
		    	
		    case "2":
		    	System.out.printf("출금액을 입력하세요 : ");	
		    	Scanner scan2 = new Scanner(System.in);
		    	int whthDraw = Integer.parseInt(scan2.nextLine());
		    	if(balance < whthDraw) {
		    		System.out.printf("%d원을 출금하려 했으나, 잔액이 부족합니다.\n",whthDraw);	
		    	}
		    	else {
		    		balance -= whthDraw;
			    	System.out.printf("%d원을 출금하였습니다.\n",whthDraw);	
		    	}	    			    	
		    	break;
		    	
		    case "3":
		    	System.out.printf("현재 잔액 : %d\n",balance);	
		    	break;
		    }
			
		}while (!num.equals("4"));
		
		System.out.println("시스템을 종료합니다.");		
	}
}

