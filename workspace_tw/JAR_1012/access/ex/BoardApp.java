package access.ex;

public class BoardApp {

	public static void main(String[] args) {
		
		Board board = Board.getInstance();
		board.setBno(1);
		System.out.println(board.getBno());
	}

}
