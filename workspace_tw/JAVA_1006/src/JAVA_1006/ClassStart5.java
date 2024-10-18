package JAVA_1006;

public class ClassStart5 {
	public static void main(String[] args) {
		
		// Student배열 타입으로 바꾸고
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		Student[] students = new Student[]{student1, student2};
		
		students[0].name = "학생1";
		students[0].age = 15;
		students[0].grade = 90;
		
		students[1].name = "학생2";
		students[1].age = 16;
		students[1].grade = 80;
		
		for (int i = 0; i < students.length; i++)
		{		
			System.out.printf("이름 : %s 나이 : %d 성적 %d\n", students[i].name, students[i].age, students[i].grade);			
		}
		
		// 각각 값 할당하시고 
		
		// 아래에서 for문 써서 출력
		
		for (int i = 0; i < students.length; i++)
		{
			//System.out.println("이름: " + students[i]);
		}
	}
}
