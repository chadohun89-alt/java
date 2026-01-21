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
		
		Product product1 = new Product("라면", 1000, 5);
		Product product2 = new Product("맥주", 5000, 3);
		Product product3 = new Product("소주", 5000, 2);
		
		
		product1.setBundlePrice(product1.bundlePrice());
		product2.setBundlePrice(product2.bundlePrice());
		product3.setBundlePrice(product3.bundlePrice());
		
		int totalPrice = product1.getBundlePrice()+product2.getBundlePrice()+product3.getBundlePrice();
		


		list.add(product1);
		list.add(product2);
		list.add(product3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("---------------");
		System.out.println("합계 : "+ totalPrice);
		

		
		
		
		
		
		

	}

}
