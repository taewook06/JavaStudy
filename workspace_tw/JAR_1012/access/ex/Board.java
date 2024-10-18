package access.ex;

public class Board {
	private static Board instance;
	private int bno;
	private String content;
	
	public static Board getInstance() {
		if(instance == null) {
			instance = new Board();
		}
		return instance;
	}
	
	public int getBno() {
		return bno;
	}
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
}
