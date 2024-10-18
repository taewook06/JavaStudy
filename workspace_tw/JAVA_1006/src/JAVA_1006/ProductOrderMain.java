package JAVA_1006;

import java.util.Scanner;

public class ProductOrderMain {
	public static void main(String[] args) {
		
		System.out.println("제품명: ");
		Scanner scanner1 = new Scanner(System.in);
		ProductOrder productName = new ProductOrder();
		productName.productName = scanner1.nextLine();
		
		System.out.println("제품가격: ");
		Scanner scanner2 = new Scanner(System.in);
		ProductOrder productPrice = new ProductOrder();
		productName.productPrice = Integer.parseInt(scanner2.nextLine());	
		
		System.out.println("제품수량: ");
		Scanner scanner3 = new Scanner(System.in);
		ProductOrder productQuantity = new ProductOrder();
		productName.productQuantity = Integer.parseInt(scanner3.nextLine());		
		
		System.out.printf("제품명 : %s 제품가격: %d 제품수량 : %d\n", productName.productName, productName.productPrice, productName.productQuantity);
		System.out.printf("최종가격: %d", productName.productPrice * productName.productQuantity);	
	}
}
