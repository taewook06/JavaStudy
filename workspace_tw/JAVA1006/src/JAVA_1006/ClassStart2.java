package JAVA_1006;

public class ClassStart2 {
	public static void main(String[] args) {

		String[] studentName = {"학생1", "학생2"};
		int[] studentAge = {15, 16}; 
		int[] studentGrade = {90, 80}; 
		
//		System.out.printf("이름 : %s 나이 : %d 성적 : %d\n", studentName[0], studentAge[0], studentGrade[0]);
//		System.out.printf("이름 : %s 나이 : %d 성적 : %d", studentName[1], studentAge[1], studentGrade[1]);
		
		for(int i = 0; i < studentName.length; i++)
		{
			System.out.printf("이름 : %s 나이 : %d 성적 : %d\n", studentName[i], studentAge[i], studentGrade[i]);
		}
	}
}
