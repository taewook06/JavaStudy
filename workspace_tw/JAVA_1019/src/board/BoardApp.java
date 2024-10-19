package board;

import java.util.Scanner;

public class BoardApp {
	// 메인 애플리케이션 클래스
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board board = new Board();
		
		while (true) {
			System.out.println("======= 게시판 앱 =======");
			System.out.println("1. 게시글 추가");
			System.out.println("2. 게시글 보기");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 종료");
			System.out.println("1~4 선택 >> ");
			
			String choice = scanner.nextLine();
			// 1. 입력했을 때 게시글 추가기능 수행
			// 제목, 내용 둘 다 각각 입력받아서 저장해야함
			
			// 2 게시글 보기
			
			// 3 게시글 삭제
			// 삭제한 id 입력받아야 함
			// try catch 예외 발생 위험 없는 코드는 try문안에
			
			// 4 종료
			// scanner close 지원 해제
			System.exit(0);
			break;
			// default문 위의 1~4까지의 숫자가 아닌 경우 
			// 잘못 입력했다는 안내
		}
	}
}
