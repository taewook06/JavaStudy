package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i < 3; i++) {		
			System.out.println("입력 > ");
			
			Scanner scanner = new Scanner(System.in);
			String key = scanner.nextLine();
			
			Scanner scanner2 = new Scanner(System.in);
			int value = Integer.parseInt(scanner2.nextLine());
			
			hashMap.put(key, value);
		}
		System.out.println(hashMap);
	}
}
