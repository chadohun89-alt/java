package exam15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		/*
		영수증
		
		라면 1000 5 5000
		맥주 5000 3 15000
		소주 5000 2 10000
		-----------------
		합계 : 30000

		 */
		
		/*
		 * 객체 생성.
		 * 
		 * 리스트에 각 객체를 넣는다.
		 * 
		 * 출력한다.
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();


		
		for(int i = 0; i<3; i++) {
			Product product = new Product();
			System.out.print("상품이름, 가격, 수량 입력 : ");
			product.productName = sc.nextLine();
			product.productPrice = sc.nextInt();
			sc.nextLine();
			product.productQuantity = sc.nextInt();
			sc.nextLine();
			product.bundlePrice();
			
			list.add(product);
		}
		
		int totalPrice = list.get(0).bundlePrice + list.get(1).bundlePrice + list.get(2).bundlePrice;
		
		System.out.println("영수증");
		
		for( Product p : list) {
			System.out.println(p);
		}
		System.out.println(totalPrice);

	

	}

}
