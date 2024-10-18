package JAVA_1012;

public class MethodInitMain1 {
	public static void main(String[] args) {
		MemberInit init = new MemberInit();
		init.name ="user1";
		init.age = 15;
		init.grade = 90;
		
		MemberInit init2 = new MemberInit();
		init.name ="user2";
		init.age = 16;
		init.grade = 80;
		
		MemberInit[] members = {init, init2};
		
		for(MemberInit m : members) {
			System.out.println("이름 :", + m.age);
		}
		static void initMember(MemberInit init, String name, int age, int grade)
		{
			init.name ="user1";
			init.age = 15;
			init.grade = 90;
		}
}
