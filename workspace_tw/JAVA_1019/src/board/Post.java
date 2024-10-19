package board;

// 게시물 클래스 (객체 생성 1개당 게시물 1개)
public class Post {
	private static int count = 0; // 게시물 번호
	private int id; // 게시물 고유 번호
	private String title; // 게시물 제목
	private String content; // 게시물 내용
	
	// 매개변수 생성자
	public Post(String title, String content) {
		this.title = title;
		this.content = content;
	}
	// getter/ setter
	public static getCount() {
		
	}
	
	// toString 오버라이딩
	
	// equals메서드 오버라이드
}

// 사용되는 개념

// 클래스, 객체
// 배열, 컬렉션 프레임워크 (ArrayList)
// 메서드, 오버로딩
// 접근 제어자, 캡슐화
// 상속, 다형성
// toString()
// equals()