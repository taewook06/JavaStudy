package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력 > ");
		
		for(int i = 0; i < 3; i++) {
			String item = scanner.nextLine();
			arrayList.add(item);
		}
		System.out.println(arrayList);
	}
}
