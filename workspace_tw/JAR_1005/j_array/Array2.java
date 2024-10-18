package j_array;

public class Array2 {

	public static void main(String[] args) {
		// 1차원 배열의 선언과 생성 (단순히 순서대로 나열된 배열)
		
		int[] students; // 배열 변수 선언
		students = new int[5]; 
		// int형 변수 5개를 담을 수 있는 배열 생성 (생성시 내부값 자동 초기화)
		// 숫자는 0, boolean은 false, String은 null 로 초기화 됨
		
		// 변수 값 대입
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;
		
		// 변수 값 사용
		System.out.println("학생1 점수: " + students[0]);
		System.out.println("학생2 점수: " + students[1]);
		System.out.println("학생3 점수: " + students[2]);
		System.out.println("학생4 점수: " + students[3]);
		System.out.println("학생5 점수: " + students[4] + "\n");
		
		// for문으로 리팩토링 
		// 리팩토링 : 기존의 코드 기능은 유지하면서 가독성을 높이고, 유지보수를 용이하게 수정하는 것
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("학생" + (i + 1) + "점수" + students[i]);
		}
	}
}
