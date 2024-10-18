package j_array;

public class Array3 {

	public static void main(String[] args) {
		// 배열의 생성과 초기화
		int[] students_a = new int[] {90,80,70,60,50,};
		int[] students_b = {90,80,70,60,50,};
		// 학생의 점수를 추가해도 { } 배열 안의 내용만 변경하고 나머지 코드는 변경하지 않아도 됨
	
		// 변수 값 사용
		for(int i = 0; i < students_a.length; i++) {
			System.out.println("학생" + (i + 1) + "점수: "+ students_a[i]); 
		}
	}
}
