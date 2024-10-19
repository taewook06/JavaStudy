package collection;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx1 {
	// HashSet 만들고 3개 입력한 다음에 중복이면은 다른 값 들어가도록
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		// 데이터 추가
		hashSet.add("Java");
		hashSet.add("Python");
		hashSet.add("Java");
		
		// 반복문 안에서 중복이면 다른 값 들어오도록
		String input = "";
		
		for(String str : hashSet) {
			if(str.equals(input)) {
				hashSet.remove(str);
			}			
		}
		
		// 출력
		System.out.println(hashSet);
	}
}
